package net.wanho.mapper;

import net.wanho.pojo.User;

import java.util.List;

/**
 * Created by acer on 2019/4/18.
 */
public interface UserMapper {

    List<User> selectAll();

    void addUser(User user);

    void delete(User user);

    User queryUserId(User user);

    void update(User user);
}
