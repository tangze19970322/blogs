package com.blogs.controller;

import com.blogs.dto.Result;
import com.blogs.entity.Menu;
import com.blogs.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/menu")
public class MenuContrller {

    @Resource
    private MenuService menuService;

    @RequestMapping(value = "/menuList",method = RequestMethod.GET)
    @ResponseBody
    public Result<Menu> findAllMenu(){
        Result result = new Result();
        try {
            List<Menu> menus = menuService.findAllMenu();
            result.setData(menus);
            return  result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setError(e.toString());
            result.setSuccess(false);
            return  result;
        }

    }

}
