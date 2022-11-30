package com.henrique.cleanarch.entrypoint.controller.mapper;

import com.henrique.cleanarch.core.domain.Customer;
import com.henrique.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.henrique.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest request);

    CustomerResponse toCustomerResponse(Customer customer);
}
