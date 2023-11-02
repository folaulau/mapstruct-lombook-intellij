package com.mapstruct.lombook.intellij.dto;

import com.mapstruct.lombook.intellij.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT
)
//@formatter:on
public interface EntityDTOMapper {

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "email", ignore = true)
    })
    User patchUserWithUserUpdateDTO(UserUpdateDTO userUpdateDTO, @MappingTarget User user);

    UserDTO mapUserToUserDTO(User patchedUser);
}
