package com.jyh.enity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jiangyiheng
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "demo_jpa")
public class People {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String sex;
    private String email;
    private int age;
}
