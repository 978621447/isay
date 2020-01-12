package com.wjy.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangJinYi 2020/1/12
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @GetMapping("/ping")
    public String ping(String ping) {
        return ping;
    }

}
