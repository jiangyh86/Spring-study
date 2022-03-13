package com.jyh.bootrestul.controller;

import com.jyh.bootrestul.common.AjaxResponse;
import com.jyh.bootrestul.model.Article;
import com.jyh.bootrestul.model.Reader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author jiangyiheng
 */
@RestController
@Slf4j
@RequestMapping("/api/v1")
public class ArticleController {

    @GetMapping("/article/{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id){
        List<Reader> list = List.of(Reader.builder().id(12).name("cd").build(), Reader.builder().id(33).name("dvs").build());

        Article article = Article.builder()
                .id(id)
                .author("jyh")
                .content("从jyh")
                .CreateTime(new Date())
                .title("123123")
                .update(new Date())
                .readerList(list)
                .build();
        return AjaxResponse.success(article);
    }

    @PostMapping("/articles")
    public AjaxResponse saveArticle(@RequestBody Article article){
        log.info("saveArticle:"+article);

        return AjaxResponse.success(article);
    }
    @PutMapping("/articles")
    public AjaxResponse updateArticle(@RequestBody Article article){
        log.info("updateArticle:"+article);
        return AjaxResponse.success(article);
    }

    @DeleteMapping("/articles")
    public AjaxResponse deleteArticle(@RequestParam Long id){
        log.info("deleteArticle:"+id);
        return AjaxResponse.success();
    }
}
