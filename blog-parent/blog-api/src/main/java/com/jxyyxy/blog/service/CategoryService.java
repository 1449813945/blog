package com.jxyyxy.blog.service;

import com.jxyyxy.blog.vo.CategoryVo;
import com.jxyyxy.blog.vo.Result;

public interface CategoryService {

    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoryDetailById(Long id);
}
