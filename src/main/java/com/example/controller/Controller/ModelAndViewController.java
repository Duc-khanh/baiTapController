package com.example.controller.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelAndViewController {
    // bai 10
    @RequestMapping("/HelloWord")
    public ModelAndView helloWord() {
        ModelAndView modelAndView = new ModelAndView("/helloWord");
        modelAndView.addObject("message", "HelloWord");
        return modelAndView;

    }
}
