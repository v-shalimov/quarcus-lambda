package com.example.quarkus;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ProcessingService {

    public List<OutputUser> processUser(Integer count) {

        List<OutputUser> users = new ArrayList<>();

        for (int i = 0; i < count; i++) {

            users.add(
                    OutputUser.builder()
                            .firstName(String.format("First Name %d", i))
                            .lastName(String.format("Last Name %d", i))
                            .address(
                                    UserAddress.builder()
                                            .number(String.format("Number %d", i))
                                            .streetName(String.format("Address %d", i))
                                            .city(String.format("City %d", i))
                                            .country(String.format("Country %d", i))
                                            .build()
                            )
                            .build()
            );

        }

        return users;

    }
}
