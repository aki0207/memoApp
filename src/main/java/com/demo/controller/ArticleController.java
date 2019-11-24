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

    /**
     * 記事タイトル一覧
     *　@param Model
     * @return 遷移先のページ
     */
    @RequestMapping(value="index")
    public String init(Model model) {

        List<ArticleBean> list = articleService.selectTitle();
        model.addAttribute("list",list);

        return "index";
    }
    
    /**
     * 記事投稿一覧
     *　@param Model
     * @return 遷移先のページ
     */
    @RequestMapping(value="create")
    public String create(Model model) {

        return "create";
    }
}
