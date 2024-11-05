package io.codeexperience.appwiremock.customers.service;

import io.codeexperience.appwiremock.customers.dto.CustomerResponse;
import io.codeexperience.appwiremock.customers.infra.client.CustomerClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static io.codeexperience.appwiremock.testutils.TestProvider.CUSTOMER_RESPONSE;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

    @Mock
    private CustomerClient customerClient;

    @InjectMocks
    private CustomerService consentCustomerService;


    @Test
    void getCustomerInClientByConsentId_returnsCustomerResponse() {

        when(customerClient.getCustomer()).thenReturn(CUSTOMER_RESPONSE);

        CustomerResponse response = consentCustomerService.getCustomerInClientByConsentId();

        assertEquals(CUSTOMER_RESPONSE, response);
    }


}