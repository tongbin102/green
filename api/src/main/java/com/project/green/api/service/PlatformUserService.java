package com.project.green.api.service;

import com.project.green.api.repository.entity.PlatformUser;

import java.util.List;

/**
 * @Author tb
 * @Date 2017/6/29 9:44
 */
public interface PlatformUserService {

    List<PlatformUser> selectAll();

    PlatformUser selectByPrimaryKey(Integer id);

}
