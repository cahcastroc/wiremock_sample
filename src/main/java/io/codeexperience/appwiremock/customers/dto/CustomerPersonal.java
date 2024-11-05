package io.codeexperience.appwiremock.customers.dto;

import lombok.Builder;

import java.util.List;

@Builder
public record CustomerPersonal(
        String updateDateTime,
        String personalId,
        String brandName,
        String civilName,
        String socialName,
        String birthDate,
        String maritalStatusCode,
        String maritalStatusAdditionalInfo,
        String sex,
        List<String> companiesCnpj,
        Documents documents,
        List<OtherDocuments> otherDocuments,
        boolean hasBrazilianNationality,
        List<Nationality> nationality,
        List<Filiation> filiation,
        Contacts contacts
) {
}
