package com.kevin.gamespop.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController {

    @GetMapping("/")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView("/hello");
        System.out.println(mv);

        return mv;
    }
}
