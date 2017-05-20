package com.mvc.myproject.controller;

/**
 * Created by Administrator on 2017/1/3.
 */

import com.mvc.myproject.model.BaseUser;
import com.mvc.myproject.repository.UserQuerys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private UserQuerys userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "addUser";
    }

    @RequestMapping(value = "/addUserPost", method = RequestMethod.POST)
    public String register(ModelMap model, HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String pass = request.getParameter("pass");

        BaseUser baseUser = new BaseUser();
        baseUser.setUserName(userName);
        baseUser.setPassWord(pass);
        userRepository.saveAndFlush(baseUser);
        model.addAttribute("message", "注册成功!");
        return "hello";
    }

    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    public String userList(ModelMap model) {
        List<BaseUser> list = userRepository.findAll();
        model.addAttribute("list", list);
        return "userlist";
    }

    @RequestMapping(value = "/chankan", method = RequestMethod.GET)
    public String chankan(@RequestParam String id, ModelMap model) {
         BaseUser user = userRepository.findOne(id);
        model.addAttribute("user", user);
        return "userdetail";
    }

    @RequestMapping(value = "/deleteuser", method = RequestMethod.GET)
    public String deleteuser(@RequestParam String id, ModelMap model) {
        userRepository.delete(id);
        model.addAttribute("message","删除成功");
        return "message";
    }

    @RequestMapping(value = "/updatauser", method = RequestMethod.GET)
    public String updatauser(@RequestParam String id, ModelMap model) {
        BaseUser user = userRepository.findOne(id);
        model.addAttribute("user", user);
        return "updatauser";
    }

    @RequestMapping(value = "/savauserupdata", method = RequestMethod.POST)
    public String savauserupdata(@ModelAttribute("baseUser") BaseUser baseUser,ModelMap model) {
        userRepository.updateUserPhone(baseUser.getUserName(),baseUser.getPassWord(),baseUser.getId());
        model.addAttribute("message","修改成功");
        return "message";
    }
}