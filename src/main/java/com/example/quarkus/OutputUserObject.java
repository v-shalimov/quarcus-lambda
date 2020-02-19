package com.example.quarkus;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class OutputUserObject {

    private String requestId;
    private List<OutputUser> result;

}
