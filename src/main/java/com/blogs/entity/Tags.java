package com.blogs.entity;

public class Tags {

    private int tid;//标签id

    private String tagsName;//标签名称

    private String tagsColor;//标签颜色

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTagsName() {
        return tagsName;
    }

    public void setTagsName(String tagsName) {
        this.tagsName = tagsName;
    }

    public String getTagsColor() {
        return tagsColor;
    }

    public void setTagsColor(String tagsColor) {
        this.tagsColor = tagsColor;
    }

    @Override
    public String toString() {
        return "Tags{" +
                "tid=" + tid +
                ", tagsName='" + tagsName + '\'' +
                ", tagsColor='" + tagsColor + '\'' +
                '}';
    }
}
