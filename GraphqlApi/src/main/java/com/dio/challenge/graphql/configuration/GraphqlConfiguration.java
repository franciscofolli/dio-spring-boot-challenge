package com.dio.challenge.graphql.configuration;

import com.dio.challenge.graphql.mutations.resolvers.UserMutationsResolver;
import com.dio.challenge.graphql.queries.resolvers.UserQueriesResolver;
import com.dio.challenge.graphql.types.resolvers.UserTypeResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphqlConfiguration {

    @Bean
    public UserQueriesResolver getUserQueriesResolver(){
        return new UserQueriesResolver();
    }

    @Bean
    public UserTypeResolver getUserTypeResolver(){
        return new UserTypeResolver();
    }

    @Bean
    public UserMutationsResolver getUserMutationsResolver(){
        return new UserMutationsResolver();
    }
}
