package com.henrique.cleanarch.core.usecase;

import com.henrique.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void execute(Customer customer, String zipcode);

}
