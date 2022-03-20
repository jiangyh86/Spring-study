package com.jyh.model;

import lombok.Data;

import java.util.Date;

/**
 * @author jiangyiheng
 */
@Data
public class Book {
    private Integer id;
    private String name;
    private Double price;
    private Date publicationTime;

}
