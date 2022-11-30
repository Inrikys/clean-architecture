package com.henrique.cleanarch.core.usecase.impl;

import com.henrique.cleanarch.core.dataprovider.FindCustomerById;
import com.henrique.cleanarch.core.domain.Customer;
import com.henrique.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer execute(String id) {
        return findCustomerById.execute(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

}
