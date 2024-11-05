package io.codeexperience.appwiremock.customers.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CustomerResponse(
        @JsonProperty("data")
        CustomerPersonal customerPersonal
) {
}
