package com.henrique.cleanarch.dataprovider;

import com.henrique.cleanarch.core.dataprovider.FindCustomerById;
import com.henrique.cleanarch.core.domain.Customer;
import com.henrique.cleanarch.dataprovider.repository.CustomerRepository;
import com.henrique.cleanarch.dataprovider.repository.entity.CustomerEntity;
import com.henrique.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class FindCustomerByIdImpl implements FindCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> execute(String id) {
        Optional<CustomerEntity> customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
