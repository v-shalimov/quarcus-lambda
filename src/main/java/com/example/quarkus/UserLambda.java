package com.example.quarkus;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import javax.inject.Inject;
import javax.inject.Named;

@Named("user")
public class UserLambda implements RequestHandler<InputUserObject, OutputUserObject> {

    @Inject
    ProcessingService service;

    @Override
    public OutputUserObject handleRequest(InputUserObject input, Context context) {

        return OutputUserObject.builder()
                .requestId(context.getAwsRequestId())
                .result(service.processUser(input.getCount()))
                .build();

    }

}
