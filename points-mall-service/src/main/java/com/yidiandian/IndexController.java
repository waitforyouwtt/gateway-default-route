package com.yidiandian;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 凤凰小哥哥
 * @date 2020-11-03
 */
@RestController
@RequestMapping("mall")
public class IndexController {

    @GetMapping("/points-user")
    public String pointsUser(){
        return "你好：我是积分商城的服务";
    }
}
