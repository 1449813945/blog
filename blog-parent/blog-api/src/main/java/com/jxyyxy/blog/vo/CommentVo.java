package com.jxyyxy.blog.vo;

import lombok.Data;

import java.util.List;

@Data
public class CommentVo  {

    // 防止前端 精度损失 把id转为string
    // 分布式id比较长，传到前端会员精度损失，必须转换为String类型
    // @JsonSerialize(using = ToStringSerializer.class)
    private String id;

    private UserVo author;

    private String content;

    private List<CommentVo> childrens;

    private String createDate;

    private Integer level;

    private UserVo toUser;
}