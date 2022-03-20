package com.jyh.controller;


import com.jyh.common.AjaxResponse;
import com.jyh.enity.Article;
import com.jyh.service.impl.ArticleJpaServiceImpl;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author huangzhen
 */
@RestController
@RequestMapping(value = "/api/articles")
public class ArticleControllerDemo {
    @Resource
    private ArticleJpaServiceImpl articleJpaService;

    @GetMapping(value = "/all")
    public AjaxResponse selectAll(){
        return AjaxResponse.success(articleJpaService.selectAll());
    }
    @PostMapping(value = "/add")
    public AjaxResponse addArticle(@RequestBody Article article){
        return AjaxResponse.success(articleJpaService.saveArticle(article));
    }
    @PutMapping
    public AjaxResponse updateArticle(@RequestBody Article article){
        if (articleJpaService.saveArticle(article)!=null) {
            return AjaxResponse.success("修改成功");
        }else {
            return null;
        }
    }
    @GetMapping("{id}")
    public AjaxResponse findById(@PathVariable int id){
        return AjaxResponse.success(articleJpaService.findById(id));
    }

    @GetMapping(value = "/page")
    public Page<Article> findBookNoCriteria(@RequestParam Integer page,@RequestParam Integer size){
        return articleJpaService.findBookNoCriteria(page,size);
    }

}
