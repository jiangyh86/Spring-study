package com.jyh.service;

import com.jyh.enity.Book;
import org.springframework.data.domain.Page;

/**
 * @author jiangyiheng
 */
public interface BookService {

    /**
     *
     * @param page
     * @param size
     * @return
     */
    Page<Book> findBookNoCriteria(Integer page,Integer size);

    /**
     *
     * @param page
     * @param size
     * @param book
     * @return
     */
    Page<Book> findBookCriteria(Integer page,Integer size,Book book);
}
