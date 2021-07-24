package com.jxyyxy.blog.controller;

import com.jxyyxy.blog.service.CategoryService;
import com.jxyyxy.blog.vo.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("categorys")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    @RequestMapping
    public Result categories(){
        return categoryService.findAll();
    }

    @RequestMapping("detail")
    public Result categoriesDetail(){
        return categoryService.findAllDetail();
    }

    @RequestMapping("detail/{id}")
    public Result categoryDetailById(@PathVariable("id") Long id){
        return categoryService.categoryDetailById(id);
    }
}