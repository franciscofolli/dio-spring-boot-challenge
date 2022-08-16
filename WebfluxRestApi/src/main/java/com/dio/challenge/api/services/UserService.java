package com.dio.challenge.api.services;

import com.dio.challenge.api.dtos.data.MessageResponseDTO;
import com.dio.challenge.api.dtos.data.UserDTO;

public interface UserService {
    String NOT_IMPLEMENTED_EXCEPTION = "User serivce does not have this method implemented";

    default UserDTO findUserById(Long id){
        throw new RuntimeException(NOT_IMPLEMENTED_EXCEPTION);
    }

    default UserDTO addUser(UserDTO body){
        throw new RuntimeException(NOT_IMPLEMENTED_EXCEPTION);
    }

    default MessageResponseDTO deleteUser(Long id){
        throw new RuntimeException(NOT_IMPLEMENTED_EXCEPTION);
    }

    default UserDTO updateUser(Long id, UserDTO body){
        throw new RuntimeException(NOT_IMPLEMENTED_EXCEPTION);
    }
}
