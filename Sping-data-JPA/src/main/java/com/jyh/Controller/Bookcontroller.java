package com.jyh.Controller;

import com.jyh.enity.Book;
import com.jyh.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author jiangyiheng
 */
@RestController
@RequestMapping("/api/book")
public class Bookcontroller {
    @Resource
    BookService bookService;

    @GetMapping(value = "/page")
    public Page<Book> findBookNoCriteria(@RequestParam Integer page, @RequestParam Integer size){
        return bookService.findBookNoCriteria(page,size);
    }
}
