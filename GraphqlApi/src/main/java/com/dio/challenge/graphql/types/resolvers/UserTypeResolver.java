package com.dio.challenge.graphql.types.resolvers;

import com.dio.challenge.graphql.types.UserType;
import com.coxautodev.graphql.tools.GraphQLResolver;

public class UserTypeResolver implements GraphQLResolver<UserType> {

    public String getId(UserType userType) {
        return userType.getId();
    }

    public String getFirstName(UserType userType) {
        return userType.getFirstName();
    }

    public String getMiddleName(UserType userType) {
        return userType.getMiddleName();
    }

    public String getLastName(UserType userType) {
        return userType.getLastName();
    }

    public Integer getAge(UserType userType) {
        return userType.getAge();
    }
}
