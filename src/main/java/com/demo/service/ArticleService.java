package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.ArticleBean;
import com.demo.mapper.ArticleMapper;

@Service
public class ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    public List<ArticleBean> selectTitle(){
        return articleMapper.selectArticleAll();
    }
}
