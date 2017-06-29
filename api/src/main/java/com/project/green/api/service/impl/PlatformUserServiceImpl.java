package com.project.green.api.service.impl;

import com.project.green.api.repository.entity.PlatformUser;
import com.project.green.api.repository.mapper.PlatformUserMapper;
import com.project.green.api.service.PlatformUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author tb
 * @Date 2017/6/29 9:47
 */
@Service
public class PlatformUserServiceImpl implements PlatformUserService {

    @Autowired
    PlatformUserMapper userMapper;

    @Override
    public List<PlatformUser> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public PlatformUser selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
