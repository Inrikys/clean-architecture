package com.henrique.cleanarch.core.usecase.impl;

import com.henrique.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.henrique.cleanarch.core.dataprovider.UpdateCustomer;
import com.henrique.cleanarch.core.domain.Address;
import com.henrique.cleanarch.core.domain.Customer;
import com.henrique.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.henrique.cleanarch.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final FindAddressByZipCode findAddressByZipCode;
    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase,
                                     FindAddressByZipCode findAddressByZipCode,
                                     UpdateCustomer updateCustomer) {

        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void execute(Customer customer, String zipCode) {

        findCustomerByIdUseCase.execute(customer.getId());

        Address address = findAddressByZipCode.execute(zipCode);
        customer.setAddress(address);

        updateCustomer.execute(customer);
    }
}
