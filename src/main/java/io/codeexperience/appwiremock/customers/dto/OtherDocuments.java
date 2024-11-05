package io.codeexperience.appwiremock.customers.dto;

public record OtherDocuments(String type,
                             String typeAdditionalInfo,
                             String number,
                             String checkDigit,
                             String additionalInfo,
                             String expirationDate
) {
}
