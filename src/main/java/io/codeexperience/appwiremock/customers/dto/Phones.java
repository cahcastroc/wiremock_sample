package io.codeexperience.appwiremock.customers.dto;

public record Phones(
        boolean isMain,
        String type,
        String additionalInfo,
        String countryCallingCode,
        String areaCode,
        String number,
        String phoneExtension
) {
}
