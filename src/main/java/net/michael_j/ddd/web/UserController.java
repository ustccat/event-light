package net.michael_j.ddd.web;

import net.michael_j.ddd.service.application.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Michael Jiang on 16/1/12.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping(value = "/register.do", method = RequestMethod.GET)
    public String register(String name, Integer age) {
        userServiceImpl.register(name, age);
        return "register completed!";
    }

    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public String login(String name) {
        userServiceImpl.login(name);
        return "login completed!";
    }

    @RequestMapping(value = "/logout.do", method = RequestMethod.GET)
    public String logout(String name) {
        userServiceImpl.logout(name);
        return "logout completed!";
    }
}
