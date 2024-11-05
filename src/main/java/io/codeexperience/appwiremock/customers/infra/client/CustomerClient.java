package io.codeexperience.appwiremock.customers.infra.client;


import io.codeexperience.appwiremock.common.config.MockBankApiConfig;
import io.codeexperience.appwiremock.common.exceptions.ClientException;
import io.codeexperience.appwiremock.common.exceptions.enums.ErrorCode;
import io.codeexperience.appwiremock.customers.dto.CustomerResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
@Slf4j
public class CustomerClient {
    private final RestClient restClient;


    public CustomerClient(RestClient.Builder restClient, MockBankApiConfig mockBankApiConfig) {
        this.restClient = restClient.baseUrl(mockBankApiConfig.url()).build();
    }

    public CustomerResponse getCustomer() {
        return restClient.get()
                .uri("/open-banking/v1/customers")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError, (request, response) -> {
                    throw new ClientException(ErrorCode.CUSTOMER_CLIENT_is4xxServerError);
                })
                .onStatus(HttpStatusCode::is5xxServerError, (request, response) -> {
                    throw new ClientException(ErrorCode.CUSTOMER_CLIENT_is5xxServerError);
                })
                .body(CustomerResponse.class);
    }

}
