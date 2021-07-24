package com.jxyyxy.blog.controller;

import com.jxyyxy.blog.common.aop.LogAnnotation;
import com.jxyyxy.blog.common.cache.Cache;
import com.jxyyxy.blog.service.ArticleService;
import com.jxyyxy.blog.vo.Result;
import com.jxyyxy.blog.vo.params.ArticleParam;
import com.jxyyxy.blog.vo.params.PageParams;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

//json数据进行交互
@RestController
@RequestMapping("articles")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    /**
     * 首页文章列表
     * @param pageParams
     * @return
     */
    @RequestMapping
    //加上此注解 代表要对此接口记录日志
    @LogAnnotation(module="文章",operator="获取文章列表")
    @Cache(expire = 5 * 60 * 1000,name = "listArticle")
    public Result listArticle(@RequestBody PageParams pageParams){

        return articleService.listArticle(pageParams);
    }

    /**
     * 首页 最热文章
     * @return
     */
    @RequestMapping("hot")
    @Cache(expire = 5 * 60 * 1000,name = "hotArticle")
    public Result hotArticle(){
        int limit = 3;
        return articleService.hotArticle(limit);
    }

    /**
     * 首页 最新文章
     * @return
     */
    @RequestMapping("new")
    @Cache(expire = 5 * 60 * 1000,name = "newArticles")
    public Result newArticles(){
        int limit = 3;
        return articleService.newArticles(limit);
    }

    /**
     * 首页 文章归档
     * @return
     */
    @RequestMapping("listArchives")
    public Result listArchives(){
        return articleService.listArchives();
    }

    /**
     * 查看文章详情
     * @param articleId
     * @return
     */
    @RequestMapping("view/{id}")
    public Result findArticleById(@PathVariable("id") Long articleId){
        return articleService.findArticleById(articleId);
    }

    @RequestMapping("publish")
    public Result publish(@RequestBody ArticleParam articleParam){

        return articleService.publish(articleParam);
    }
}
