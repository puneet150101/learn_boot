package com.learn.demodb;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String resp(Student s,HttpServletRequest req){
        rep.save(s);
        req.setAttribute("s", s);
        return "resp.jsp";
    }
    @RequestMapping("/search")
    public String search(int sid,HttpServletRequest req){
        if(rep.findById(sid).isPresent())
        {
            req.setAttribute("s",rep.findById(sid).orElse(new Student()));
            return "found.jsp";
        }
        else return "nfound.jsp";
    }
    @RequestMapping("/delete")
    public String delete(int sid,HttpServletRequest req){
        Student s = rep.findById(sid).orElse(new Student());
        rep.delete(s);
        req.setAttribute("s", s);
        return "delete.jsp";
    }
}
