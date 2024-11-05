package io.codeexperience.appwiremock.testutils;

import io.codeexperience.appwiremock.customers.dto.CustomerPersonal;
import io.codeexperience.appwiremock.customers.dto.CustomerResponse;
import io.codeexperience.appwiremock.customers.dto.Documents;

import java.util.List;

public class TestProvider {

    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_JSON = "application/json";
    public static final String CONSENT_ID = "consent123abc";
    public static final String URI_CONSENTS = "/open-banking/v1/consents/" + CONSENT_ID;
    public static final String CPF_NUMBER = "12345678901";
    public static final CustomerResponse CUSTOMER_RESPONSE = new CustomerResponse(CustomerPersonal.builder()
                                                                .updateDateTime("2023-10-13T12:00:00Z")
                                                                .personalId(CONSENT_ID)
                                                                .brandName("Capybara Experience")
                                                                .civilName("Capybara da Silva Sauro")
                                                                .socialName("Capy")
                                                                .birthDate("2010-02-02")
                                                                .documents(Documents.builder().cpfNumber(CPF_NUMBER).build()).build());





}
