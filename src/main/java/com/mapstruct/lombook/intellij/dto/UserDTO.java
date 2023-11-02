package com.mapstruct.lombook.intellij.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(value = Include.NON_NULL)
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private LocalDate dob;
}
