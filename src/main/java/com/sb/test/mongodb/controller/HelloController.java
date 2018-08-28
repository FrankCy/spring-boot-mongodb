package com.sb.test.mongodb.controller;

import com.sb.test.mongodb.pojo.User;
import com.sb.test.mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-boot-mongodb
 * @package: com.sb.test.mongodb.controller
 * @email: cy880708@163.com
 * @date: 2018/8/27 下午2:52
 * @mofified By:
 */
@RestController
public class HelloController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/save")
    public String save(){

        User user = new User();
        user.setId("2");
        user.setName("李四");
        user.setAge(22);
        userRepository.save(user);

        System.out.println("保存成功");
        return "ok";
    }

    @RequestMapping("/find")
    public String find(){
        List<User> findAll = userRepository.findAll();
        System.out.println(findAll);
        return "ok";
    }

    @RequestMapping("/findByName")
    public String findByName(){
        User findByName = userRepository.findByName("张三");
        System.out.println(findByName);
        return "ok";
    }

}
