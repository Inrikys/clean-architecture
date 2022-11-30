package com.henrique.cleanarch.core.usecase.impl;

import com.henrique.cleanarch.core.dataprovider.DeleteCustomerById;
import com.henrique.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import com.henrique.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final DeleteCustomerById deleteCustomerById;

    public DeleteCustomerByIdUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase, DeleteCustomerById deleteCustomerById) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.deleteCustomerById = deleteCustomerById;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdUseCase.execute(id);
        deleteCustomerById.execute(id);
    }

}
