package com.henrique.cleanarch.entrypoint.controller.request;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerRequest {

    @NotBlank
    private String name;

    @CPF
    @NotBlank
    private String cpf;

    @NotBlank
    private String zipCode;

}
