package io.codeexperience.appwiremock.customers.dto;

public record NationalityDocuments(
        String type,
        String number,
        String expirationDate,
        String issueDate,
        String country,
        String additionalInfo
) {
}
