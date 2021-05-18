package com.example.demo.Infrastructure.tools;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class tools {

    //Note basics : Generate ObjectMapper initalize once.
    //      * that will avoid unnecessary creation of object.

    private  static ObjectMapper mapper = null;
    public static Object toPojo(String payload , Class def) throws IOException {
        if(mapper == null) mapper = new ObjectMapper();
        return mapper.readValue(payload, def);
    }
}
