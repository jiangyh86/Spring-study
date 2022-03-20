package com.jyh.service.impl;

import com.jyh.dao.ArticleDao;
import com.jyh.enity.Article;
import com.jyh.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jiangyiheng
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleDao articleDao;

    @Override
    public Article saveArticle(Article article) {
        int i = articleDao.save(article);
        return i!=0? article:null;
    }

}
