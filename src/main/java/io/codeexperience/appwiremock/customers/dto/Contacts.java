package io.codeexperience.appwiremock.customers.dto;

import java.util.List;

public record Contacts(
        List<PostalAddresses> postalAddresses,
        List<Phones> phones,
        List<Emails> emails
) {
}
