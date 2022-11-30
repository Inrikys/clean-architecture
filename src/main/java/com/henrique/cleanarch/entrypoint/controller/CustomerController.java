package com.henrique.cleanarch.entrypoint.controller;


import com.henrique.cleanarch.core.domain.Customer;
import com.henrique.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import com.henrique.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.henrique.cleanarch.core.usecase.InsertCustomerUseCase;
import com.henrique.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.henrique.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.henrique.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.henrique.cleanarch.entrypoint.controller.response.CustomerResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private DeleteCustomerByIdUseCase deleteCustomerByIdUseCase;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest request, UriComponentsBuilder uriComponentsBuilder) {

        Customer newCustomer = customerMapper.toCustomer(request);
        insertCustomerUseCase.execute(newCustomer, request.getZipCode());

        URI location = uriComponentsBuilder.path("/api/v1/customers").buildAndExpand(newCustomer.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping("/id")
    public ResponseEntity<CustomerResponse> findById(@PathVariable String id) {

        Customer customer = findCustomerByIdUseCase.execute(id);
        CustomerResponse response = customerMapper.toCustomerResponse(customer);

        return ResponseEntity.ok(response);
    }

    @PutMapping("/id")
    public ResponseEntity<Void> update(@PathVariable final String id, @Valid @RequestBody CustomerRequest request) {

        Customer customer = customerMapper.toCustomer(request);
        customer.setId(id);

        updateCustomerUseCase.execute(customer, request.getZipCode());

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> delete(@PathVariable final String id) {

        deleteCustomerByIdUseCase.delete(id);

        return ResponseEntity.noContent().build();
    }

}
