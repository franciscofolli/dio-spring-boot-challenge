package com.dio.challenge.graphql.mappers;


import com.dio.challenge.graphql.domain.entities.UserEntity;
import com.dio.challenge.graphql.types.UserInput;
import com.dio.challenge.graphql.types.UserType;

public interface UserMapper {

    String USER_MAPPER_NOT_IMPLEMENTED_MESSAGE = "User mapper not implemented";

    default UserType fromUserEntityToType(UserEntity userEntity){
        throw new RuntimeException(USER_MAPPER_NOT_IMPLEMENTED_MESSAGE);
    }

    default UserEntity fromUserTypeToUserEntity(UserType userType){
        throw new RuntimeException(USER_MAPPER_NOT_IMPLEMENTED_MESSAGE);
    }

    default UserEntity dynamicUserTypeToEntity(UserType userType, UserEntity userEntity){
        throw new RuntimeException(USER_MAPPER_NOT_IMPLEMENTED_MESSAGE);
    }

    default UserType fromUserInputToUserType(UserInput userInput){
        throw new RuntimeException(USER_MAPPER_NOT_IMPLEMENTED_MESSAGE);
    }
}
