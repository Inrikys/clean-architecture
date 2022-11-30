package com.henrique.cleanarch.entrypoint.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerResponse {

    private String name;

    private String cpf;

    private Boolean isValidCpf;

    private AddressResponse address;

}
