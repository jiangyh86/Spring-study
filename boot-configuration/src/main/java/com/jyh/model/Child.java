package com.jyh.model;

import lombok.Data;

import java.util.List;

/**
 * @author jiangyiheng
 */
@Data
public class Child {
    private String name;
    private Integer age;
    private List<Friend> friends;
}
