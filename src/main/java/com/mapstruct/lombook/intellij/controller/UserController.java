package com.mapstruct.lombook.intellij.controller;

import com.mapstruct.lombook.intellij.dto.AuthenticationResponseDTO;
import com.mapstruct.lombook.intellij.dto.AuthenticatorDTO;
import com.mapstruct.lombook.intellij.dto.UserDTO;
import com.mapstruct.lombook.intellij.dto.UserUpdateDTO;
import com.mapstruct.lombook.intellij.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static org.springframework.http.HttpStatus.OK;

@Tag(name = "User", description = "User Endpoints")
@RequestMapping("/users")
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "Authenticate")
    @PostMapping(value = "/authenticate")
    public ResponseEntity<AuthenticationResponseDTO> authenticate(@RequestBody AuthenticatorDTO authenticatorDTO) {

        log.info("authenticatorDTO={}", authenticatorDTO);

        AuthenticationResponseDTO authenticationResponseDTO = userService.authenticate(authenticatorDTO);

        return new ResponseEntity<>(authenticationResponseDTO, OK);
    }

    @Operation(summary = "Update")
    @PutMapping(value = "/update")
    public ResponseEntity<UserDTO> update(@RequestBody UserUpdateDTO userUpdateDTO) {

        log.info("userUpdateDTO={}", userUpdateDTO);

        UserDTO userDTO = userService.update(userUpdateDTO);

        return new ResponseEntity<>(userDTO, OK);
    }
}
