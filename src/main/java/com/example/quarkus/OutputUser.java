package com.example.quarkus;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class OutputUser {

    private String firstName;
    private String lastName;
    private UserAddress address;

}
