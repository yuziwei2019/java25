package net.wanho.service;

import com.github.pagehelper.PageInfo;
import net.wanho.pojo.User;

/**
 * Created by acer on 2019/4/18.
 */
public interface UserServiceI {

    PageInfo<User> selectAll(Integer pageNum);

    void addUser(User user);

    void delete(User user);

    User queryUserId(User user);

    void update(User user);
}
