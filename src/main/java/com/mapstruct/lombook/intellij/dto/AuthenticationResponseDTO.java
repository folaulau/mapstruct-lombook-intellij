package com.mapstruct.lombook.intellij.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponseDTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Jwt token used for API calls.
     */
    private String            token;

    /**
     * user id
     */
    private Long              id;

    /**
     * user uuid
     */
    private String            uuid;

    private String            email;

    private String            name;
}
