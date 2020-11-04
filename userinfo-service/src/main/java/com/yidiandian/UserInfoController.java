package com.yidiandian;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 凤凰小哥哥
 * @date 2020-11-03
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {

    @GetMapping("/getUser")
    public UserInfo getUser(){
        UserInfo userInfo = new UserInfo(1,"云澜哥哥","123456");
        return userInfo;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name){
        return "你好："+name;
    }
}
