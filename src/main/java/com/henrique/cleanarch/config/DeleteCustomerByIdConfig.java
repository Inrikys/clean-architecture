package com.henrique.cleanarch.config;

import com.henrique.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import com.henrique.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.henrique.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.henrique.cleanarch.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            DeleteCustomerByIdImpl deleteCustomerById
    ){
        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUseCase, deleteCustomerById);
    }

}
