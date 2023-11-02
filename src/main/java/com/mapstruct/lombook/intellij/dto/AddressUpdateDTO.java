package com.mapstruct.lombook.intellij.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(value = Include.NON_NULL)
public class AddressUpdateDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String street;

    private String city;

    private String zipcode;

    private String state;
}
