package com.blogs.service.impl;

import com.blogs.entity.Tags;
import com.blogs.mapper.TagsMapper;
import com.blogs.service.TagsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TagsServiceImpl implements TagsService{

    @Resource
    private TagsMapper tagsMapper;

    public List<Tags> findAllTags() {
        return tagsMapper.findAllTags();
    }

    public int delTags(int tid) {
        return tagsMapper.delTags(tid);
    }

    public int insertOrUpdateTags(List<Tags> list) {
        return tagsMapper.insertOrUpdateTags(list);
    }
}
