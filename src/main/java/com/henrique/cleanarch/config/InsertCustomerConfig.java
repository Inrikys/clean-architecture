package com.henrique.cleanarch.config;

import com.henrique.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.henrique.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.henrique.cleanarch.dataprovider.InsertCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer);
    }

}
