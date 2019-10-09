package com.splearn.crowx.controller;

import com.splearn.crowx.model.Article;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AuthController {
    @RequestMapping("/hello")
    public Article test(){
        Article article = new Article();
        article.setAuthor("李老八45554");
        article.setId(311);
        return article;
    }
}
