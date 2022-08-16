package com.dio.challenge.api.controllers.impl;

import com.dio.challenge.api.controllers.UserController;
import com.dio.challenge.api.dtos.data.MessageResponseDTO;
import com.dio.challenge.api.dtos.data.UserDTO;
import com.dio.challenge.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class UserControllerImpl implements UserController {

    @Autowired
    private UserService userService;

    @Override
    public Mono<UserDTO> getUser(Long id) {
        return Mono.just(this.userService.findUserById(id));
    }

    @Override
    public Mono<UserDTO> addUser(@RequestBody UserDTO body) {
        return Mono.just(this.userService.addUser(body));
    }

    @Override
    public Mono<MessageResponseDTO> deleteUser(Long id) {
        return Mono.just(this.userService.deleteUser(id));
    }

    @Override
    public Mono<UserDTO> updateUser(Long id, UserDTO body) {
        return Mono.just(this.userService.updateUser(id, body));
    }
}
