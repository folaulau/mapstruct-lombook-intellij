package com.mapstruct.lombook.intellij.service;

import com.mapstruct.lombook.intellij.dto.*;
import com.mapstruct.lombook.intellij.model.Address;
import com.mapstruct.lombook.intellij.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Slf4j
public class UserServiceImp implements UserService {

    private Address address = Address.builder()
            .street("123 test rd")
            .city("Lehi")
            .state("UT")
            .zipcode("84043")
            .build();

    private User user = User.builder()
            .id(1L)
            .firstName("Folau")
            .lastName("Kaveinga")
            .email("folaukaveinga@gmail.com")
            .address(address)
            .dob(LocalDate.now().minusYears(30))
            .build();

    @Autowired
    private EntityDTOMapper entityDTOMapper;

    @Override
    public AuthenticationResponseDTO authenticate(AuthenticatorDTO authenticatorDTO) {
        return null;
    }

    @Override
    public UserDTO update(UserUpdateDTO userUpdateDTO) {

        User patchedUser = entityDTOMapper.patchUserWithUserUpdateDTO(userUpdateDTO, user);

        log.info("patchedUser={}", patchedUser);

        return entityDTOMapper.mapUserToUserDTO(patchedUser);
    }

    @Override
    public UserDTO getProfile() {
        return entityDTOMapper.mapUserToUserDTO(user);
    }
}
