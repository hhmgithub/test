package com.hhm.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.hhm.test.mode.User;
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>{
}