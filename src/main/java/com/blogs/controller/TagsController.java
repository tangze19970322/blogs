package com.blogs.controller;

import com.blogs.dto.Result;
import com.blogs.entity.Tags;
import com.blogs.service.TagsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/tags")
public class TagsController {

    @Resource
    private TagsService tagsService;


    @RequestMapping(value = "/findAllTags",method = RequestMethod.GET)
    @ResponseBody
    public Result findAllTags(){
        Result result = new Result();
        try {
            List<Tags> tagsList = tagsService.findAllTags();
            result.setData(tagsList);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setError(e.toString());
            result.setSuccess(false);
            return result;
        }
    }
}
