package com.jyh.bootrestul;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jyh.bootrestul.model.Reader;

public class Test {
    public static void main(String[] args) throws JsonProcessingException {
        Reader reader = Reader.builder().id(44444).name("hz").build();
        ObjectMapper mapper = new ObjectMapper();
        String value = mapper.writeValueAsString(reader);
        System.out.println(value);
        Reader readValue = mapper.readValue(value, Reader.class);
        System.out.println(readValue);
    }
}
