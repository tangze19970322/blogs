package com.blogs.service;

import com.blogs.entity.Tags;

import java.util.List;

public interface TagsService {

    List<Tags> findAllTags();

    int delTags(int tid);

    int insertOrUpdateTags(List<Tags> list);
}
