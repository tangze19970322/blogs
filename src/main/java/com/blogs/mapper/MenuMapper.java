package com.blogs.mapper;

import com.blogs.entity.Menu;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface MenuMapper {

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
