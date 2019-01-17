package com.blogs.entity;

import java.util.Date;

/**
 * 文章分类实体
 */
public class ArticleType {

    private int atid;//文章分类id

    private int min;//所属菜单id

    private String articleName;//分类名称

    private int articleNumber;//分类拥有文章数量

    private Date createTime;//创建时间

    private Date updateTime;//更新时间

    public int getAtid() {
        return atid;
    }

    public void setAtid(int atid) {
        this.atid = atid;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public int getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(int articleNumber) {
        this.articleNumber = articleNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "articleType{" +
                "atid=" + atid +
                ", min=" + min +
                ", articleName='" + articleName + '\'' +
                ", articleNumber=" + articleNumber +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
