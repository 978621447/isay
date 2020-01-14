package com.wjy.user.service.impl;

import com.wjy.user.entity.User;
import com.wjy.user.mapper.IUserMapper;
import com.wjy.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author WangJinYi 2020/1/13
 */
@Component
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    @Override
    public String test() {
        return userMapper.test();
    }

    @Override
    public User getById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
