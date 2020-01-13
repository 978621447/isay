package com.wjy.user.controller;

import com.wjy.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangJinYi 2020/1/12
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/ping")
    public String ping(String ping) {
        return ping;
    }

    @GetMapping("/test")
    public String test() {
        return userService.test();
    }
}
