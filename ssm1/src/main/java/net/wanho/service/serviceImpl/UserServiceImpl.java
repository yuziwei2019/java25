package net.wanho.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.wanho.mapper.UserMapper;
import net.wanho.pojo.User;
import net.wanho.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by acer on 2019/4/18.
 */
@Service
public class UserServiceImpl implements UserServiceI {
   @Autowired
   private UserMapper userMapper;

    @Override
    public PageInfo<User> selectAll(Integer pageNum) {
        //修改分页星系
        PageHelper.startPage(pageNum,2);
        List<User> userList = userMapper.selectAll();

        PageInfo<User> info=new PageInfo<User>(userList);

        return info;
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void delete(User user) {
        userMapper.delete(user);
    }

    @Override
    public User queryUserId(User user) {
       User users= userMapper.queryUserId(user);
        return users;
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }
}
