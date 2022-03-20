package com.jyh.dao;

import com.jyh.enity.Article;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class ArticleDaoTest {
    @Resource
    private ArticleDao articleDao;

    @Test
    void save() {
        Article article = Article.builder()
                .id(444)
                .author("李煜")
                .content("Think in Java")
                .title("JAVA")
                .createTime(new Date())
                .build();
        int rows=articleDao.save(article);
        System.out.println(rows);
    }
    @Test
    void selectById(){
        Article article = articleDao.selectById(1);
        System.out.println(article);
    }
    @Test
    void deleteById(){
        int i = articleDao.deleteById(1);
        System.out.println(i);
    }
    @Test
    void updateArticle(){
        Article article = Article.builder()
                .id(2)
                .author("fsdfdsf")
                .content("Think in Java")
                .title("JAVA")
                .createTime(new Date())
                .build();
        int i = articleDao.updateArticle(article);
        System.out.println(i);
    }

    @Test
    void selectAll(){
        List<Article> list = articleDao.selectAll();
        System.out.println(list);
    }
}