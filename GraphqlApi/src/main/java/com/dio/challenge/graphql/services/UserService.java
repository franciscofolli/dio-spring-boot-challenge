package com.dio.challenge.graphql.services;


import com.dio.challenge.graphql.types.UserType;

public interface UserService {
    String NOT_IMPLEMENTED_EXCEPTION = "User serivce does not have this method implemented";

    default UserType findUserById(String id){
        throw new RuntimeException(NOT_IMPLEMENTED_EXCEPTION);
    }

    default UserType addUser(UserType body){
        throw new RuntimeException(NOT_IMPLEMENTED_EXCEPTION);
    }

    default void deleteUser(String id){
        throw new RuntimeException(NOT_IMPLEMENTED_EXCEPTION);
    }

    default UserType updateUser(String id, UserType body){
        throw new RuntimeException(NOT_IMPLEMENTED_EXCEPTION);
    }
}
