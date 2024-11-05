package io.codeexperience.appwiremock.programmaticwiremock;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

@Configuration
@Slf4j
public class ProgrammaticWiremockStub {
    private WireMockServer wireMockServer;

    @Bean
    public WireMockServer wireMockServer() {
        wireMockServer = new WireMockServer(WireMockConfiguration.options().port(9090));
        wireMockServer.start();
        configureStubs();

        log.info("-----> [Wiremock - Programático] - Rodando com sucesso na porta 9090");
        return wireMockServer;
    }

    private void configureStubs() {
            wireMockServer.stubFor(get(urlEqualTo("/open-banking/v1/customers"))
                    .willReturn(aResponse()
                            .withStatus(200)
                            .withHeader("Content-Type", "application/json")
                            .withBodyFile("get_api_customer.json")));

    }

    @PreDestroy
    public void stopWireMockServer() {
        if (wireMockServer != null && wireMockServer.isRunning()) {
            wireMockServer.stop();
            log.info("-----> [Wiremock - Programático] - Execução terminada");
        }
    }
}
