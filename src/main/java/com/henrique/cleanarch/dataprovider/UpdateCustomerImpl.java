package com.henrique.cleanarch.dataprovider;

import com.henrique.cleanarch.core.dataprovider.UpdateCustomer;
import com.henrique.cleanarch.core.domain.Customer;
import com.henrique.cleanarch.dataprovider.repository.CustomerRepository;
import com.henrique.cleanarch.dataprovider.repository.entity.CustomerEntity;
import com.henrique.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UpdateCustomerImpl implements UpdateCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void execute(Customer customer) {
        CustomerEntity customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
