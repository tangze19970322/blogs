package com.blogs.service.impl;

import com.blogs.entity.Menu;
import com.blogs.mapper.MenuMapper;
import com.blogs.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService{

    @Resource
    private MenuMapper menuMapper;

    public List<Menu> findAllMenu() {
        return menuMapper.findAllMenu();
    }

    public int updateMenuByMid(Menu menu) {
        return menuMapper.updateMenuByMid(menu);
    }
}
