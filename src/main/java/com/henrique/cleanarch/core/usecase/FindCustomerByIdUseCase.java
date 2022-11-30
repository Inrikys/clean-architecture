package com.henrique.cleanarch.core.usecase;

import com.henrique.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer execute(final String id);

}
