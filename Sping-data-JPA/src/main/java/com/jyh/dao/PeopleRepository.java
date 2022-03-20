package com.jyh.dao;

import com.jyh.enity.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * @author jiangyiheng
 */
public interface PeopleRepository extends JpaRepository<People,Integer> {
    @Override
    List<People> findAll();


    List<People> findByFirstName(String firstName);

    People findByFirstNameAndLastName(String firstName,String lastName);

    People findByLastNameOrFirstName(String lsatName,String firstName);

    /**
     * 查询数据库是否在数据库中
     * @param firstName
     * @return
     */
    People findByFirstNameIs(String firstName);

    People findByFirstNameEquals(String firstName);

    //Between
    // 在Age数值age到age2之间的数据
    List<People> findByAgeBetween(Integer age1, Integer age2);

    //LessThan
    // 小于指定age数值之间的数据
    List<People> findByAgeLessThan(Integer age);

    //LessThanEqual
    // 小于等于指定age数值的数据
    List<People> findByAgeLessThanEqual(Integer age);

    //GreaterThan //大于指定age数值之间的数据
    List<People> findByAgeGreaterThan(Integer age);

    //GreaterThanEqual
    // 大于或等于指定age数值之间的数据
    List<People> findByAgeGreaterThanEqual(Integer age);

    //Before //在指定age数值之后的数据类似关键字
    <LessThan> List<People> findByAgeAfter(Integer age);

    //After //在指定age数值之前的数据类似关键字
    <GreaterThan> List<People> findByAgeBefore(Integer age);
    //IsNull //返回age字段为空的数据
    List<People> findByAgeIsNull();

    //NotNull
    // 返回age字段不为空的数据
    List<People> findByAgeNotNull();

    //Like
    // 类似findByFirstName，不是模糊查询！
    List<People> findByFirstNameLike(String firstName);

    //NotLike
    // 类似findByFirstNameNot
    List<People> findByFirstNameNotLike(String firstName);

    //Not
    // 返回不是指定firstName的所有数据
    List<People> findByFirstNameNot(String firstName);

    //StartingWith //查找数据表中以指定字符开头的数据
    List<People> findByFirstNameStartingWith(String firstName);

    //EndingWith //查找数据表中以指定字符结尾的数据(同上)
     List<People> findByFirstNameEndingWith(String firstName);

    //Containing
    // 效果并不是查询字段中包含指定字符串的数据，指定的字符串必须打全，类似findByFirstName，感觉很 鸡肋
     List<People> findByFirstNameContaining(String firstName);

    //OrderBy //根据age选取所有的数据源并按照LastName进行升序排序
     List<People> findByAgeOrderByFirstName(Integer age);

    //In //查找包含多个指定age返回的数据
     List<People> findByAgeIn(List<Integer> age);
}
