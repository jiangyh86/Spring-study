package com.jyh.service.impl;

import com.jyh.enity.Article;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class ArticleJpaServiceImplTest {
    @Resource
    private ArticleJpaServiceImpl articleJpaService;

    @Test
    void saveArticle() {
        Article article = Article.builder()
                .id(8)
                .author("李煜123")
                .content("Think in Java")
                .title("JAVA")
                .createTime(new Date())
                .updateTime(new Date())
                .build();
        Article saveArticle = articleJpaService.saveArticle(article);
        System.out.println(saveArticle);
    }

    @Test
    void deleteById() {
        articleJpaService.deleteById(4);
    }

    @Test
    void updateArticle() {
        Article article = Article.builder()
                .id(2)
                .author("李煜")
                .content("Think in Java")
                .title("JAVA")
                .updateTime(new Date())
                .build();
        articleJpaService.updateArticle(article);
    }

    @Test
    void selectAll() {
        List<Article> list = articleJpaService.selectAll();
        System.out.println(list);
    }

    @Test
    void findById() {
        Article article = articleJpaService.findById(3);
        System.out.println(article);
    }

    @Test
    void findByAuthor() {
        List<Article> author = articleJpaService.findByAuthor("李煜");
        System.out.println(author);
    }

    @Test
    void findBookNoCriteria(){
        Page<Article> bookNoCriteria = articleJpaService.findBookNoCriteria(3,6);
        System.out.println(bookNoCriteria);
    }
}