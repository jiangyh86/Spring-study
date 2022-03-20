package com.jyh.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

/**
 * @author jiangyiheng
 */
@Data
@Configuration// 表示一个配置类
@PropertySource(name = "employeeProperties" ,value = "classpath:employee.properties")
public class Employee {
    @Value("#{'${employee.names}'.split(',')}")
    private List<String> employeeNames;

    @Value("#{'${employee.names}'.split(',')[0]}")
    private String firstName;

    @Value("#{${employee.age}}")
    private Map<String,Integer> employeeAge;

    @Value("#{${employee.age}['two']!=null? ${employee.age}['two']: 80}")
    private Integer ageWithDefaultValue;

    @Value("#{systemProperties['java.home']}")
    private String javaHome;

    @Value("#{systemProperties['user.dir']}")
    private String userDir;
}
