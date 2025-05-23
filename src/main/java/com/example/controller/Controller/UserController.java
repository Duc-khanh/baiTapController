package com.example.controller.Controller;

import com.example.controller.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserController {

    // bai 9
    @RequestMapping("/userForm")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "/userForm";
    }

    @RequestMapping("/submitUser")
    public String submitForm(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("submittedUser", user);
        return "/userResult";

    }
    // bai 11


    @GetMapping("/register")
    public String showFormRegister(Model model) {
        model.addAttribute("user", new User());
        return "/registerForm";

    }

    //    @PostMapping("/register")
//    public String submitFormRegister(@ModelAttribute("user")User user, Model model) {
//        model.addAttribute("message", "Đăng ký thành công");
//        return "/registerResult";
//    }
    @PostMapping("/register")
    public RedirectView processForm(@ModelAttribute("user") User user, Model model) {
        return new RedirectView("/thanks");
    }

    @GetMapping("/thanks")
    public String showThanks(Model model) {
        return "/thanks";
    }

    // bai 13
    @GetMapping("/form")
    public String showFormAdd(Model model) {
        model.addAttribute("user", new User());
        return "/showFormAdd";
    }

    @PostMapping("/form")
    public String resultForm(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("message", "Thông tin đã nhận thành công");
        return "/resultAdd";
    }
    //
    @GetMapping("/edit")
    public String showEditForm(Model model) {
        User user = new User("Nguyen Duc Khanh", 20);
        model.addAttribute("user", user);
        return "/editForm";
    }

    @PostMapping("/edit")
    public String submitEdit(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("message", "Thông tin đã được cập nhật!");
        return "/editResult";
    }
}
