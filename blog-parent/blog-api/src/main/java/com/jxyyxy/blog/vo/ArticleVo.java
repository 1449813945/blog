package com.jxyyxy.blog.vo;

import lombok.Data;

import java.util.List;

@Data
public class ArticleVo {

    // 防止前端 精度损失 把id转为string
    // 分布式id比较长，传到前端会员精度损失，必须转换为String类型
    // @JsonSerialize(using = ToStringSerializer.class)
    private String id;

    private String title;

    private String summary;

    private Integer commentCounts;

    private Integer viewCounts;

    private Integer weight;

    /**
     * 创建时间
     */
    private String createDate;

    private String author;

    private ArticleBodyVo body;

    private List<TagVo> tags;

    private CategoryVo category;

}