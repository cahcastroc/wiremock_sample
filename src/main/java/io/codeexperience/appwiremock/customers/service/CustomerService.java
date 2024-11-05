package io.codeexperience.appwiremock.customers.service;


import io.codeexperience.appwiremock.customers.infra.client.CustomerClient;
import io.codeexperience.appwiremock.customers.dto.CustomerResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {

   private final CustomerClient client;

    public CustomerResponse getCustomerInClientByConsentId() {
       return client.getCustomer();
    }


}
