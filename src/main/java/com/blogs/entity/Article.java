package com.blogs.entity;

import java.util.Date;

/**
 * 文章实体
 */
public class Article {

    private int aid;//文章id

    private int atid;//文章分类id

    private String articleTypeName;//文章分类名称

    private String articleTitle;//文章标题

    private String articleContent;//文章内容

    private String createTime;//创建时间

    private String updateTime;//更新时间

    private int visitNumber;//访问次数

    private int estimateNumber;//评价数量

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getAtid() {
        return atid;
    }

    public void setAtid(int atid) {
        this.atid = atid;
    }

    public String getArticleTypeName() {
        return articleTypeName;
    }

    public void setArticleTypeName(String articleTypeName) {
        this.articleTypeName = articleTypeName;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public int getVisitNumber() {
        return visitNumber;
    }

    public void setVisitNumber(int visitNumber) {
        this.visitNumber = visitNumber;
    }

    public int getEstimateNumber() {
        return estimateNumber;
    }

    public void setEstimateNumber(int estimateNumber) {
        estimateNumber = estimateNumber;
    }

    @Override
    public String toString() {
        return "Article{" +
                "aid=" + aid +
                ", atid=" + atid +
                ", articleTypeName='" + articleTypeName + '\'' +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", visitNumber=" + visitNumber +
                ", EstimateNumber=" + estimateNumber +
                '}';
    }
}
