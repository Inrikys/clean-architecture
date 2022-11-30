package com.henrique.cleanarch.config;

import com.henrique.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.henrique.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.henrique.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.henrique.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(
                findCustomerByIdUseCase,
                findAddressByZipCode,
                updateCustomer
        );
    }

}
