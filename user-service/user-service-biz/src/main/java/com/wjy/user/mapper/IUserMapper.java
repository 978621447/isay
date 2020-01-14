package com.wjy.user.mapper;

import com.wjy.user.domain.User;
import org.springframework.stereotype.Component;

/**
 * @author WangJinYi 2020/1/13
 */
@Component
public interface IUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    String test();
}
