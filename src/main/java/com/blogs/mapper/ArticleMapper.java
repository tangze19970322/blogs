package com.blogs.mapper;

import com.blogs.entity.Article;
import com.sun.org.glassfish.external.probe.provider.annotations.ProbeParam;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
import java.util.Map;

@MapperScan
public interface ArticleMapper {

    /**
     * 添加文章
     * @param article
     * @return
     */
    int addArticle(Article article);

    /**
     * 更新文章
     * @param article
     * @return
     */
    int updateArticle(Article article);

    /**
     * 删除文章
     * @param aid
     * @return
     */
    int deleteArticle(int aid);


    /**
     * 查询文章详情
     * @param aid
     * @return
     */
    Article findArticle(int aid);

    /**
     * 根据热度查询文章简介集合
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<Article> findArticleListByAccessNumber(@Param("field")String field,@Param("pageIndex") Integer pageIndex, @Param("pageSize") Integer pageSize);

    /**
     * 根据分类查询文章简介集合
     * @param map
     * @return
     */
    List<Article> findArticleListByAccessType(Map<String,Object> map);
}
