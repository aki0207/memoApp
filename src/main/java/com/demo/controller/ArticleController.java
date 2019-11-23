package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.bean.ArticleBean;
import com.demo.service.ArticleService;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value="index")
    public String init(Model model) {

        List<ArticleBean> list = articleService.selectTitle();
        model.addAttribute("list",list);

        return "index";
    }
}
