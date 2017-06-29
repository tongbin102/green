package com.project.green.app.controller;

import com.project.green.api.repository.entity.PlatformUser;
import com.project.green.api.service.PlatformUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author tb
 * @Date 2017/6/28 13:36
 */
@RestController
@RequestMapping("/user")
public class PlatfromUserController {

    @Autowired
    private PlatformUserService userService;

    @RequestMapping("/add")
    public Map<String, Object> addUser() {
        Map<String, Object> ret_map = new HashMap<String, Object>();
        List<PlatformUser> userList = userService.selectAll();
        ret_map.put("userList", userList);
        return ret_map;
    }

    @RequestMapping("/list/{id}")
    public Map<String, Object> selectByPrimaryKey(@PathVariable(value = "id") Integer id) {
        Map<String, Object> ret_map = new HashMap<String, Object>();
        PlatformUser user = userService.selectByPrimaryKey(id);
        ret_map.put("user", user);
        return ret_map;
    }
}
