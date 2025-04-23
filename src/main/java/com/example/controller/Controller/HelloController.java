package com.example.controller.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HelloController {
//    // bai 1
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message", "Hello Spring MVC!");
        return "/hello";
    }

    // bai 2
    @RequestMapping(value = {"/home","/index","/homePage"})
    public String showHome(Model model){
        model.addAttribute("message", "Chao mung ban den voi trang chu!");
        return "/home";
    }
    //  bai 3
    @RequestMapping("/time")
    public String showTime(Model model){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        model.addAttribute("currentTime", formattedDateTime);
        return "/time";
    }

    // bai 4
    @RequestMapping("/hello0")
    public String showHello(Model model) {
        String message = "Chao mung ban den voi trang chu!";
        model.addAttribute("message", message);
        return "/home";
    }
    // bai 5
    @RequestMapping("/greet")
    public String greet (@RequestParam(value = "name", required = false, defaultValue = "CTA") String name, Model model) {
        String message = "Xin chao " + name ;
        model.addAttribute("greeting", message);
        return "/greet";
    }
    // bai 6
    @RequestMapping("/user/{id}")
    public String getUserByID(@PathVariable("id") int id, Model model) {
        String message = "Thông tin người dùng có ID: " + id;
        model.addAttribute("userInfo", message);
        return "/user";
    }
     // bai 7

    @GetMapping("/showForm")
    public String showForm(Model model) {
        return "/sum";
    }
    @RequestMapping ("/sum")
    public String sum(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("sum",+ num1 + " + " + num2 + " = " + sum);
        return "/sumResult";
    }
}
