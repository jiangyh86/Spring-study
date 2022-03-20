package com.jyh.dao;

import com.jyh.enity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jiangyiheng
 *  JpaSpecificationExecutor<Article> 包含多条件查询
 */

public interface ArticleRepository extends JpaRepository<Article,Integer> , JpaSpecificationExecutor<Article> {

    /**
     * @param Author
     * @return
     */
    List<Article> findByAuthor(String Author);

}
