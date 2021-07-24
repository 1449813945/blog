package com.jxyyxy.blog.controller;

import com.jxyyxy.blog.service.TagService;
import com.jxyyxy.blog.vo.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("tags")
public class TagsController {

    @Resource
    private TagService tagService;

    @RequestMapping("hot")
    public Result hot(){
        int limit = 3;
        return tagService.hots(limit);
    }

    /**
     * 查询所有的文章标签
     * @return
     */
    @RequestMapping
    public Result findAll(){
        return tagService.findAll();
    }

    @RequestMapping("detail")
    public Result findAllDetail(){
        return tagService.findAllDetail();
    }

    @RequestMapping("detail/{id}")
    public Result findDetailById(@PathVariable("id") Long id){
        return tagService.findDetailById(id);
    }
}
