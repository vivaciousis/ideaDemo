package com.viva.demo.mapper;


import com.viva.demo.domain.User;

import java.util.List;

public interface UserMapper {

    List<User> findByLoginName(String loginName);

    List<User> list();

}