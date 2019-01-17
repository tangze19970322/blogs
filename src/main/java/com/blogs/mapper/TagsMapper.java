package com.blogs.mapper;

import com.blogs.entity.Tags;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface TagsMapper {

    List<Tags> findAllTags();

    int delTags(int tid);

    int insertOrUpdateTags(List<Tags> list);
}
