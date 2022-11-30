package com.henrique.cleanarch.dataprovider;

import com.henrique.cleanarch.core.dataprovider.DeleteCustomerById;
import com.henrique.cleanarch.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DeleteCustomerByIdImpl implements DeleteCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void execute(String id) {
        customerRepository.deleteById(id);
    }
}
