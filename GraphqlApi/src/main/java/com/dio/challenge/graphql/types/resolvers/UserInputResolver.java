package com.dio.challenge.graphql.types.resolvers;

import com.dio.challenge.graphql.types.UserInput;
import com.coxautodev.graphql.tools.GraphQLResolver;

public class UserInputResolver implements GraphQLResolver<UserInput> {

    public String getId(UserInput userInput) {
        return userInput.getId();
    }

    public String getFirstName(UserInput userInput) {
        return userInput.getFirstName();
    }

    public String getMiddleName(UserInput userInput) {
        return userInput.getMiddleName();
    }

    public String getLastName(UserInput userInput) {
        return userInput.getLastName();
    }

    public Integer getAge(UserInput userInput) {
        return userInput.getAge();
    }
}
