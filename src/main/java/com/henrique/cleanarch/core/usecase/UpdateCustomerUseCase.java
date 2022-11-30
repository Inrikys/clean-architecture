package com.henrique.cleanarch.core.usecase;

import com.henrique.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void execute(Customer customer, String zipCode);

}
