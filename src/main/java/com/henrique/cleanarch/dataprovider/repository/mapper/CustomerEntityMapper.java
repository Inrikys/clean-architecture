package com.henrique.cleanarch.dataprovider.repository.mapper;

import com.henrique.cleanarch.core.domain.Customer;
import com.henrique.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
