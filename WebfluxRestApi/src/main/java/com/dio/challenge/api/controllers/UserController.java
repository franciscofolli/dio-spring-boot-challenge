package com.dio.challenge.api.controllers;

import com.dio.challenge.api.dtos.data.MessageResponseDTO;
import com.dio.challenge.api.dtos.data.UserDTO;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

public interface UserController {

    String NOT_IMPLEMENTED_EXCEPTION_MESSAGE = "Not Implemented";

    @GetMapping("/user/{id}")
    default Mono<UserDTO> getUser(@PathVariable("id") Long id){
        throw new RuntimeException(NOT_IMPLEMENTED_EXCEPTION_MESSAGE);
    }

    @PostMapping("/user")
    default Mono<UserDTO> addUser(UserDTO body){
        throw new RuntimeException(NOT_IMPLEMENTED_EXCEPTION_MESSAGE);
    }

    @DeleteMapping("/user/{id}")
    default Mono<MessageResponseDTO> deleteUser(@PathVariable("id") Long id){
        throw new RuntimeException(NOT_IMPLEMENTED_EXCEPTION_MESSAGE);
    }

    @PutMapping("/user/{id}")
    default Mono<UserDTO> updateUser(@PathVariable("id") Long id, @RequestBody UserDTO body){
        throw new RuntimeException(NOT_IMPLEMENTED_EXCEPTION_MESSAGE);
    }
}
