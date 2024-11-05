package io.codeexperience.appwiremock.customers.dto;

public record PostalAddresses(
        boolean isMain,
        String address,
        String additionalInfo,
        String districtName,
        String townName,
        String ibgeTownCode,
        String countrySubDivision,
        String postCode,
        String country,
        String countryCode,
        GeographicCoordinates geographicCoordinates
) {
}
