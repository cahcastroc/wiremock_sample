package io.codeexperience.appwiremock.customers.dto;

import lombok.Builder;

@Builder
public record Documents(
        String cpfNumber,
        Passport passport
) {
}
