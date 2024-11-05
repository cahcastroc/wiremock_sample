package io.codeexperience.appwiremock.customers.controller;

import io.codeexperience.appwiremock.customers.service.CustomerService;
import io.codeexperience.appwiremock.customers.dto.CustomerResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/v1/customers")
    public ResponseEntity<CustomerResponse> getCustomersBanking(){
        CustomerResponse response = customerService.getCustomerInClientByConsentId();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
