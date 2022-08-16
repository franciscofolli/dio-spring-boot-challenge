package com.dio.challenge.api.mappers;

import com.dio.challenge.api.domain.entities.UserEntity;
import com.dio.challenge.api.dtos.data.UserDTO;

public interface UserMapper {

    String USER_MAPPER_NOT_IMPLEMENTED_MESSAGE = "User mapper not implemented";

    default UserDTO fromUserEntityToDTO(UserEntity userEntity){
        throw new RuntimeException(USER_MAPPER_NOT_IMPLEMENTED_MESSAGE);
    }

    default UserEntity fromUserDTOToUserEntity(UserDTO userDTO){
        throw new RuntimeException(USER_MAPPER_NOT_IMPLEMENTED_MESSAGE);
    }

    default UserEntity dynamicUserDTOToEntity(UserDTO userDTO, UserEntity userEntity){
        throw new RuntimeException(USER_MAPPER_NOT_IMPLEMENTED_MESSAGE);
    }
}
