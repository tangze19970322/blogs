package com.blogs.service;

import com.blogs.entity.Menu;

import java.util.List;

public interface MenuService {

    /**
     * 查询全部菜单
     * @return
     */
    public List<Menu> findAllMenu();


    /**
     * 根据菜单id（mid）修改菜单
     * @param menu
     * @return
     */
    public int updateMenuByMid(Menu menu);
}
