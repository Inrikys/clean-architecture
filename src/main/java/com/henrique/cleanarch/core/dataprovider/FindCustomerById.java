package com.henrique.cleanarch.core.dataprovider;

import com.henrique.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> execute(final String id);

}
