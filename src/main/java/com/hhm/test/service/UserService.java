package com.hhm.test.service;
import com.hhm.test.mapper.UserMapper;
import com.hhm.test.mode.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private  UserMapper userMapper;
    public User queryById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}