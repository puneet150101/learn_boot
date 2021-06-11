package com.learn.demoweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class test {
    @RequestMapping("/")
    public ModelAndView func(student s)
    {
        ModelAndView mv=new ModelAndView();
        mv.addObject("ob",s);
        mv.setViewName("home");
        return mv;
    }
}
