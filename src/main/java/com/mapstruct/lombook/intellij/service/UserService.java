package com.mapstruct.lombook.intellij.service;

import com.mapstruct.lombook.intellij.dto.AuthenticationResponseDTO;
import com.mapstruct.lombook.intellij.dto.AuthenticatorDTO;
import com.mapstruct.lombook.intellij.dto.UserDTO;
import com.mapstruct.lombook.intellij.dto.UserUpdateDTO;

public interface UserService {
    AuthenticationResponseDTO authenticate(AuthenticatorDTO authenticatorDTO);

    UserDTO update(UserUpdateDTO userUpdateDTO);
}
