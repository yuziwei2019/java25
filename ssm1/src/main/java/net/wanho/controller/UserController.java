package net.wanho.controller;

import com.github.pagehelper.PageInfo;
import net.wanho.pojo.User;
import net.wanho.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by acer on 2019/4/18.
 */
@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("Hello")
    public String  Hello(Map map,@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        PageInfo<User> userPageInfo = userServiceImpl.selectAll(pageNum);
        map.put("userPageInfo",userPageInfo);
        return "index";
    }

   @RequestMapping("zengjia1")
    public String zengjia1(){
        return "add";
    }

    @RequestMapping("zengjia2")
    public String zengjia2(User user){
        userServiceImpl.addUser(user);

        return "redirect:/Hello";
    }

    @RequestMapping("shanchu")
    public String shanchu(User user){
        userServiceImpl.delete(user);

        return "redirect:/Hello";
    }

    @RequestMapping("update1")
    public String update1(User user,Map map){
  User users=userServiceImpl.queryUserId(user);
        map.put("users",users);

        return "update";

    }

    @RequestMapping("update2")
    public String update2(User user){

        userServiceImpl.update(user);

        return "redirect:/Hello";
    }



}
