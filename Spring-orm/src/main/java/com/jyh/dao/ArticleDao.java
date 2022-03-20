package com.jyh.dao;

import com.jyh.enity.Article;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author jiangyiheng
 */
@Repository
public class ArticleDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public int save(Article article){
        String sql="INSERT INTO article (author,title,content,create_time) values(?,?,?,?) ";
        return jdbcTemplate.update(sql,article.getAuthor(),article.getTitle(),article.getContent(),article.getCreateTime());
    }

    public Article selectById(int id){
        String sql="select * from article where id = ? ";
        Article article = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Article.class), id);
        return article;
    }

    public List<Article> selectAll(){
        String sql="select * from article ";
       return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Article.class));
    }

    public int deleteById(int id){
        String sql="delete from article where id = ? ";
        return  jdbcTemplate.update(sql, id);
    }


    public int updateArticle(Article article){
        String sql="UPDATE article SET author = ?,title = ?,content = ?,create_time = ? where id = ? ";
        return jdbcTemplate.update(sql, article.getAuthor(), article.getTitle(), article.getContent(), article.getCreateTime(),article.getId());
    }
}
