package com.mapstruct.lombook.intellij.dto;

import com.mapstruct.lombook.intellij.model.User;
import org.mapstruct.*;

@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
//@formatter:on
public interface EntityDTOMapper {

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "email", ignore = true)
    })
    User patchUserWithUserUpdateDTO(UserUpdateDTO userUpdateDTO, @MappingTarget User user);

    UserDTO mapUserToUserDTO(User patchedUser);

    User mapUserDTOToUser(UserDTO userDTO);
}
