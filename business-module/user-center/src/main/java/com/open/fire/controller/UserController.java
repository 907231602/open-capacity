package com.open.fire.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * describe:
 *
 * @author yjj
 * @date 2020/08/05
 */
@RestController
public class UserController {

    @RequestMapping("/user")
    public String getUser() {
        System.out.println("I'm coming");
        return "I'm out";
    }
}
