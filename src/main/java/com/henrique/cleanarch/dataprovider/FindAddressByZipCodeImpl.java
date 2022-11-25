package com.henrique.cleanarch.dataprovider;

import com.henrique.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.henrique.cleanarch.core.domain.Address;
import com.henrique.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.henrique.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import com.henrique.cleanarch.dataprovider.client.response.AddressResponse;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    private final FindAddressByZipCodeClient client;

    private final AddressResponseMapper addressMapper;

    public FindAddressByZipCodeImpl(FindAddressByZipCodeClient client, AddressResponseMapper addressMapper) {
        this.client = client;
        this.addressMapper = addressMapper;
    }

    @Override
    public Address execute(String zipcode) {

        AddressResponse addressResponse = client.find(zipcode);

        return addressMapper.toAddress(addressResponse);
    }
}
