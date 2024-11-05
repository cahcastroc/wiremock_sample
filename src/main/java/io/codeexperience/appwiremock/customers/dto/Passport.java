package io.codeexperience.appwiremock.customers.dto;

public record Passport(String number,
                       String country,
                       String expirationDate,
                       String issueDate) {
}
