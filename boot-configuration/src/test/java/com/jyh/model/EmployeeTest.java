package com.jyh.model;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
@ExtendWith(SpringExtension.class) //junit   junit4  写法@RunWith(SpringExtension.class)
@SpringBootTest
class EmployeeTest {
    @Resource
    private Employee employee;

    @Test
    void valueBind() throws Exception{
        log.info(String.valueOf(employee));
        employee.getEmployeeAge().entrySet().forEach(opp-> System.out.println(opp.getKey()+"-->"+opp.getValue()));
        System.out.println(employee.getAgeWithDefaultValue());
    }
}