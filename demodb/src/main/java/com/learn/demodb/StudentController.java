package com.learn.demodb;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentController {
    @Autowired
    sturepo rep;
    // @RequestMapping("/")
    // public String base(){
    //     return "base.jsp";
    // }
    @RequestMapping("/")
    public String func(){
        return "home.jsp";
    }
    @RequestMapping("/addS")
    public ModelAndView resp(Student s){
        rep.save(s);
        ModelAndView mv = new ModelAndView("resp.jsp");
        mv.addObject("s",s);
        return mv;
    }
    @RequestMapping("/search")
    public String search(String sname, int sclass, HttpServletRequest req){
        if(sname.length()!=0)
        {
        if(rep.findBysname(sname).size()!=0)
        {
            req.setAttribute("s", rep.findBysname(sname));
            // mv.addObject("s",rep.findBysname(sname));
            // mv.setViewName("found.jsp");
            return "found.jsp";
        }
        else return "nfound.jsp";}
        else {
            if(rep.findBysclass(sclass).size()!=0)
            {
                req.setAttribute("s", rep.findBysclass(sclass));
            // mv.addObject("s",rep.findBysname(sname));
            // mv.setViewName("found.jsp");
            return "found.jsp";
            }
            else return "nfound.jsp";
        }
        // mv.setViewName("nfound.jsp");
        // return mv;
    }
    @RequestMapping("/delete")
    public ModelAndView delete(int sid){
        Student s = rep.findById(sid).orElse(new Student());
        rep.delete(s);
        ModelAndView mv =  new ModelAndView("delete.jsp");
        mv.addObject("s", s);
        return mv;
    }
    @RequestMapping("/showall")
    public String showall(HttpServletRequest req){
        req.setAttribute("s", rep.findAll());
        return "showall.jsp";
    }
    @RequestMapping("/update")
    public String update(int sid,HttpServletRequest req){
        Student s1= (Student)rep.findById(sid).orElse(new Student());
        req.setAttribute("s1", s1);
        rep.delete(s1);
        return "newdata.jsp";
    }
    @RequestMapping("/updated")
    public ModelAndView updated(Student s2){
        rep.save(s2);
        ModelAndView mv = new ModelAndView("updated.jsp");
        mv.addObject("s",s2);
        return mv;
    }
}
