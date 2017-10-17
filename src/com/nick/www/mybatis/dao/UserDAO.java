package com.nick.www.mybatis.dao;

import com.nick.www.mybatis.bean.User;

public interface UserDAO {
    
    public void addUser(User user);
    
    public void deleteUser(String userName);

}
