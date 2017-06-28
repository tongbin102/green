package com.project.green.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tb
 * @Date 2017/6/28 13:36
 */
@RestController
@RequestMapping("/user")
public class PlatfromUserController {
    @RequestMapping("/add")
    public String addUser() {
        return "add user";
    }
}
