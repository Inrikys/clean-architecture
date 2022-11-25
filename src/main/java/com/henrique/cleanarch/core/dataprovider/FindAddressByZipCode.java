package com.henrique.cleanarch.core.dataprovider;

import com.henrique.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address execute(final String zipcode);

}
