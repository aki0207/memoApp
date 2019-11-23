package com.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.demo.bean.ArticleBean;

@Mapper
public interface ArticleMapper {

    List<ArticleBean> selectArticleAll();
}
