package com.jyh.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;



/**
 * @author jiangyiheng
 */
@Data
@Component
@Validated
@ConfigurationProperties(prefix = "user")
@PropertySource(value = {"classpath:User.yml"},factory = com.jyh.util.MixPropertiesSourceFactory.class)
public class User {
    @Value("${user.name1}")
    private String name1;
    private Integer age;
    private Book book;
}
