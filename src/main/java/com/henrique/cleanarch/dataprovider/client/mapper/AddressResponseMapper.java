package com.henrique.cleanarch.dataprovider.client.mapper;

import com.henrique.cleanarch.core.domain.Address;
import com.henrique.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
