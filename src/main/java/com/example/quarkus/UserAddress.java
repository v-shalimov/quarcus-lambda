package com.example.quarkus;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserAddress {

    private String number;
    private String streetName;
    private String city;
    private String country;

}
