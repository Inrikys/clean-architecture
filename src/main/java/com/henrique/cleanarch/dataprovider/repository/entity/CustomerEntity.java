package com.henrique.cleanarch.dataprovider.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "customers")
public class CustomerEntity {

    @Id
    private String id;
    private String name;
    private String cpf;
    private AddressEntity address;
    private Boolean isValidCpf;

}
