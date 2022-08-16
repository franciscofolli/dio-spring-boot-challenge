package com.dio.challenge.graphql.queries.resolvers;

import com.dio.challenge.graphql.services.UserService;
import com.dio.challenge.graphql.types.UserType;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

public class UserQueriesResolver implements GraphQLQueryResolver {

    @Autowired
    private UserService userService;

    public UserType getUser(@NotNull String id){
        return this.userService.findUserById(id);
    }
}
