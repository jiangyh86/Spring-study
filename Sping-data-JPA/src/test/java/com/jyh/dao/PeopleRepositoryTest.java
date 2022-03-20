package com.jyh.dao;

import com.jyh.enity.People;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@Slf4j
@RunWith(SpringRunner.class)
class PeopleRepositoryTest {

    @Resource
    private PeopleRepository peopleRepository;

    @Test
    void findAll() {
        List<People> peopleList = peopleRepository.findAll();
        System.out.println(peopleList);
    }

    @Test
    void findByFirstName() {
        List<People> firstName = peopleRepository.findByFirstName("李煜");
        System.out.println(firstName.size());
    }

    //两者必须数据表里都有才能查到
    @Test
    void findByFirstNameAndLastName() {
        People people = peopleRepository.findByFirstNameAndLastName("李煜", "张三");
        System.out.println(people);
    }

    //Or //根据firstName或LastName查找,两者可以换顺序，但参数顺序必须于其保持一致
    @Test
    void findByLastNameOrFirstName() {
        People people = peopleRepository.findByLastNameOrFirstName("", "李煜");
        System.out.println(people);
    }

    //查找数据表里有没有firstName为qia的数据，这里assertNull测试通过，表示表里没有这条数据
    @Test
    public void findByFirstNameIs() {
        People people = peopleRepository.findByFirstNameIs("李煜");
        //expected null, but was:<People(id=6, firstName=李煜, lastName=张三, sex=男, email=453534357537@163.com, age=26)>
        assertNull(people);
    }

    @Test
    void findByFirstNameEquals() {
        People people = peopleRepository.findByFirstNameEquals("李煜");
        //expected null, but was:<People(id=6, firstName=李煜, lastName=张三, sex=男, email=453534357537@163.com, age=26)>
        assertNull(people);
    }

    //查询age在20岁到28岁之间的数据，不包含20和28
    @Test
    public void findByAgeBetween() {
        List<People> peopleList = peopleRepository.findByAgeBetween(20, 28);
        System.out.println(peopleList);
        assertEquals(3, peopleList.size());
    }

    @Test
    public void findByAgeLessThan() {
        List<People> peopleList = peopleRepository.findByAgeLessThan(21);
        System.out.println(peopleList.size());
        /*org.opentest4j.AssertionFailedError:
            Expected :1
            Actual   :0*/
        assertEquals(1, peopleList.size());
    }

    //age小于21
    @Test
    public void findByAgeLessThanEqual() {
        List<People> peopleList = peopleRepository.findByAgeLessThanEqual(21);
        System.out.println(peopleList.size());
        assertEquals(2, peopleList.size());
    }

    //    -------------------------------------------------------
    //age大于20
    /*org.opentest4j.AssertionFailedError:
    Expected :1
    Actual   :3*/
    @Test
    public void findByAgeGreaterThan() {
        List<People> peopleList = peopleRepository.findByAgeGreaterThan(20);
        System.out.println(peopleList);
        assertEquals(1, peopleList.size());
    }
    //同上
    @Test
    public void findByAgeGreaterThanEqual() {
        List<People> peopleList = peopleRepository.findByAgeGreaterThanEqual(20);
        assertEquals(2,peopleList.size());
    }


    @Test public void findByAgeAfter() {
        List<People> peopleList = peopleRepository.findByAgeAfter(20);
        assertEquals(2,peopleList.size());

    }

    @Test
    public void findByAgeBefore() {
        List<People> peopleList = peopleRepository.findByAgeBefore(21);
        assertEquals(2,peopleList.size());
    }
    //返回age字段为空的数据行
    @Test
    public void findByAgeIsNull() {
        List<People> peopleList = peopleRepository.findByAgeIsNull();
        assertEquals(0,peopleList.size());
    }

    @Test
    public void findByAgeNotNull() {
        List<People> peopleList = peopleRepository.findByAgeNotNull();
        assertEquals(5,peopleList.size());
    }

    //FirstName必须写全才能查到数据
    @Test public void findByFirstNameLike() {
        List<People> peopleList = peopleRepository.findByFirstNameLike("qi");
        assertEquals(5,peopleList.size());
    }

    @Test
    public void findByFirstNameNotLike() {
        List<People> peopleList = peopleRepository.findByFirstNameNotLike("qian");
        assertEquals(5,peopleList.size());
    }
    //查询firstName不是qian的所有数据
     @Test
     public void findByFirstNameNot() {
        List<People> peopleList = peopleRepository.findByFirstNameNot("qian");
        assertEquals(5,peopleList.size());
    }

    //查询firstName以a为开头的数据
    @Test
    public void findByFirstNameStartingWith() {
        List<People> peopleList = peopleRepository.findByFirstNameStartingWith("a");
        assertEquals(2,peopleList.size());
    }

    //查询firstName以n为结尾的数据
     @Test
     public void findByFirstNameEndingWith() {
        List<People> peopleList = peopleRepository.findByFirstNameEndingWith("n");
        assertEquals(0,peopleList.size());
    }
    //查询firstName为qian的数据，只写qian里的一个字符是没用的
     @Test
     public void findByFirstNameContaining() {
        List<People> peopleList = peopleRepository.findByFirstNameContaining("qian");
        assertEquals(0,peopleList.size());
    }

    @Test
    public void findByAgeOrderByFirstName() {
        List<People> peopleList = peopleRepository.findByAgeOrderByFirstName(20);
        for (People people : peopleList){
            log.info("数据结果"+people.toString());
        }
    }

    //查询年龄为20和21的所有数据
     @Test
     public void findByAgeIn() {
        List<People> peopleList = peopleRepository.findByAgeIn(Arrays.asList(20, 21));
        assertEquals(2,peopleList.size());
    }


}
