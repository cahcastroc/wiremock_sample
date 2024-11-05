package io.codeexperience.appwiremock.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mockbank.api")
public record MockBankApiConfig(String url) {
}
