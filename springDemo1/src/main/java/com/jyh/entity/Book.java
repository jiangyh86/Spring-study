package com.jyh.entity;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @author jiangyiheng
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Slf4j
public class Book {
    private Integer id;
    private String name;
    
}
