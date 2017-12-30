package com.example.demo.controller;

import com.example.demo.config.BookConfig;
import com.example.demo.service.impl.UserServiceImpl;
import com.example.demo.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Controller
public class DemoController {

    @Autowired
    private BookConfig bookConfig;

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping(name = "/hello1")
    @ResponseBody
    public String test() {

        return "hello world spring boot!\n" + bookConfig.getAuthor() + bookConfig.getName();
    }

    @RequestMapping("/get")
    @ResponseBody
    public User getUser(int id) {
        System.out.println("id = " +id);
        return userServiceImpl.getById(id);
    }


    @RequestMapping("/getPage")
    @ResponseBody
    public List<User> getPage() {
        System.out.println("get paging");
        return userServiceImpl.getByPage();
    }


    @RequestMapping("/indexPage")
    public String helloFtl(Map<String,Object> map) {
        map.put("hello","Hello FreeMarker");
        map.put("time", new Date());
        return "index";
    }

    @RequestMapping(value ="/hello/{name}", method = RequestMethod.POST)
    public String hello(@PathVariable("name") String name,
                        @RequestParam("title") String title,
                        @RequestParam("avatar") MultipartFile avatar,
                        Model model) {

        System.out.println(title);
        System.out.println(avatar.getOriginalFilename());

        model.addAttribute("name", name);
        return "hello";
    }

}
