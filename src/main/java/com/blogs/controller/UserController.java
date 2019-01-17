package com.blogs.controller;

import com.blogs.dto.Result;
import com.blogs.entity.User;
import com.blogs.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Result login(@RequestParam("account")String account, @RequestParam("password")String password) {
        Result result = new Result();
        try {
            if (account == null || (account=account.trim()).equals("")) {
                result.setError("账号不能为空");
                result.setSuccess(false);
                return result;
            }
            if (password == null || (password = password.trim()).equals("")) {
                result.setError("密码不能为空");
                result.setSuccess(false);
                return result;
            }
            User user = userService.findUserByAccountWithPassword(account, password);
            if (user == null) {
                result.setError("账号或密码错误");
                result.setSuccess(false);
                return result;
            }
            user.setPassword(null);
            result.setData(user);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setError(e.toString());
            result.setSuccess(false);
            return result;
        }
    }
}
