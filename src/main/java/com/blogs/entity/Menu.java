package com.blogs.entity;

import java.util.Date;

public class Menu {

    private int mid;//菜单id

    private String menuName;//菜单名称

    private String menuUrl;//菜单指向连接

    private int menuSort;//菜单顺序

    private Date createTime;//创建时间

    private Date updateTime;//更新时间

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public int getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(int menuSort) {
        this.menuSort = menuSort;
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
        return "Menu{" +
                "mid=" + mid +
                ", menuName='" + menuName + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", menuSort=" + menuSort +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
