package com.henrique.cleanarch.core.usecase.impl;

import com.henrique.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.henrique.cleanarch.core.dataprovider.InsertCustomer;
import com.henrique.cleanarch.core.domain.Address;
import com.henrique.cleanarch.core.domain.Customer;
import com.henrique.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;

    private final InsertCustomer insertCustomer;

    public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCustomer insertCustomer) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
    }

    @Override
    public void execute(Customer customer, String zipcode) {
        Address address = findAddressByZipCode.execute(zipcode);
        customer.setAddress(address);

        insertCustomer.execute(customer);
    }
}
