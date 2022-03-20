package com.jyh.service;

import com.jyh.enity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * @author jiangyiheng
 */
public interface ArticleService  {
    /**
     *
     * @param article
     * @return
     */
    Article saveArticle(Article article);

    /**
     *
     * @param id
     */
    void deleteById(int id);

    void updateArticle(Article article);

    List<Article> selectAll();

    Article findById(int id);

    List<Article> findByAuthor(String author);

    Page<Article> findBookNoCriteria(Integer page,Integer size);
}
