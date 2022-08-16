package com.dio.challenge.api.mappers.impl;

import com.dio.challenge.api.domain.entities.UserEntity;
import com.dio.challenge.api.dtos.data.UserDTO;
import com.dio.challenge.api.dtos.exceptions.UserNotFoundException;
import com.dio.challenge.api.mappers.UserMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO fromUserEntityToDTO(UserEntity userEntity) {
        final UserDTO toReturn = new UserDTO();
        toReturn.setId(userEntity.getId());
        toReturn.setAge(userEntity.getAge());
        toReturn.setFirstName(userEntity.getFirstName());
        toReturn.setMiddleName(userEntity.getMiddleName());
        toReturn.setLastName(userEntity.getLastName());
        return toReturn;
    }

    @Override
    public UserEntity fromUserDTOToUserEntity(UserDTO userDTO) {
        final UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userDTO.getFirstName());
        userEntity.setMiddleName(userDTO.getMiddleName());
        userEntity.setLastName(userDTO.getLastName());
        userEntity.setAge(userDTO.getAge());
        return userEntity;
    }

    @Override
    public UserEntity dynamicUserDTOToEntity(UserDTO userDTO, UserEntity userEntity) {
        if(userEntity == null){
            throw new UserNotFoundException();
        }
        if (userDTO.getFirstName() != null){
            userEntity.setFirstName(userDTO.getFirstName());
        }
        if(userDTO.getMiddleName() != null){
            userEntity.setMiddleName(userDTO.getMiddleName());
        }
        if(userDTO.getLastName() != null){
            userEntity.setLastName(userDTO.getLastName());
        }
        if(userDTO.getAge() != null){
            userEntity.setAge(userDTO.getAge());
        }
        return userEntity;
    }
}
