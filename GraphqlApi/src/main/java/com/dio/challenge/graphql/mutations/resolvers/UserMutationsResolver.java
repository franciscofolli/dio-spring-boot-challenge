package com.dio.challenge.graphql.mutations.resolvers;

import com.dio.challenge.graphql.mappers.UserMapper;
import com.dio.challenge.graphql.services.UserService;
import com.dio.challenge.graphql.types.UserInput;
import com.dio.challenge.graphql.types.UserType;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;

public class UserMutationsResolver implements GraphQLMutationResolver {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    public UserType addUser(UserInput userInput){
        return this.userService.addUser(this.userMapper.fromUserInputToUserType(userInput));
    }
}
