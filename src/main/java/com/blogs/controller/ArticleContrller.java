package com.blogs.controller;

import com.blogs.dto.Result;
import com.blogs.entity.Article;
import com.blogs.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleContrller {

    @Resource
    private ArticleService articleService;


    @RequestMapping(value = "/articleList",method = RequestMethod.GET)
    @ResponseBody
    public Result articleList(@RequestParam("field") String field,
                              @RequestParam("pageIndex") Integer pageIndex,
                              @RequestParam("pageSize") Integer pageSize){
        Result result = new Result();
        try {
            if (pageIndex==null||pageSize==null){
                result.setError("参数为空");
                result.setSuccess(false);
                return result;
            }
            List<Article> articleList = articleService.findArticleListByAccessNumber(field,pageIndex, pageSize);
            if (articleList.size()==0){
                result.setError("文章列表为空");
                result.setSuccess(false);
            }
            result.setData(articleList);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setError(e.toString());
            result.setSuccess(false);
            return result;
        }
    }

    @RequestMapping(value = "/{aid}/Article")
    public String findArticle(@PathVariable int aid, Model model){
        Article article = articleService.findArticle(aid);
        if (article==null){
            return "/index2";
        }
        model.addAttribute("article",article);
        return "article";
    }
}
