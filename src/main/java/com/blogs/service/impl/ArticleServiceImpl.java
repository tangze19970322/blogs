package com.blogs.service.impl;

import com.blogs.entity.Article;
import com.blogs.mapper.ArticleMapper;
import com.blogs.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    public int addArticle(Article article) {
        return 0;
    }

    public int updateArticle(Article article) {
        return 0;
    }

    public int deleteArticle(int aid) {
        return 0;
    }

    public Article findArticle(int aid) {
        return null;
    }

    public List<Article> findArticleListByAccessNumber(String field,Integer pageIndex,Integer pageSize) {
        return articleMapper.findArticleListByAccessNumber(field,pageIndex,pageSize);
    }

    public List<Article> findArticleListByAccessType(Map<String, Object> map) {
        return null;
    }
}
