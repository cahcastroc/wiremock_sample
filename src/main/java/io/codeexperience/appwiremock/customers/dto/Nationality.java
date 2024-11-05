package io.codeexperience.appwiremock.customers.dto;

import java.util.List;

public record Nationality(
        String otherNationalitiesInfo,
        List<NationalityDocuments> documents
) {
}
