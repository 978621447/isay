package com.wjy.user.service;

import com.wjy.user.domain.User;

/**
 * @author WangJinYi 2020/1/13
 */
public interface IUserService {

    String test();

    User getById(Integer userId);

}
