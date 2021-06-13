package com.learn.demodb;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    sturepo rep;

    // fetch student by its sid
    @GetMapping(path = "/student/{sid}")
    public Optional<Student> getbyid(@PathVariable("sid") int sid) {
        return rep.findById(sid);
    }

    // fetch all students
    @GetMapping("/students")
    public List<Student> showall() {
        return rep.findAll();
    }

    // create new student in database with form format
    @PostMapping(path = "/student", consumes = { "application/x-www-form-urlencoded", "multipart/form-data" })
    public Student save(Student student) {
        rep.save(student);
        return student;
    }

    // create new student in db with json or xml
    @PostMapping(path = "/student", consumes = { "application/json", "application/xml" })
    public Student saveinjson(@RequestBody Student student) {
        rep.save(student);
        return student;
    }

    // delete student by their sid
    @DeleteMapping("/student/{sid}")
    public String delete(@PathVariable("sid") int sid) {
        Student student = rep.findById(sid).orElse(new Student(-1, -1, "Not found"));
        if (student.getSid() != -1) {
            rep.delete(student);
            return "deleted" + " " + student.getSname();
        } else
            return "not found";
    }

    // update or create new student entry
    @PutMapping(path = "/student", consumes = { "application/x-www-form-urlencoded", "multipart/form-data" })
    public Student updateStudent(Student student) {
        rep.save(student);
        return student;
    }

    @PutMapping(path = "/student", consumes = { "application/json", "application/xml" })
    public Student updateStudentjson(@RequestBody Student student) {
        rep.save(student);
        return student;
    }
}
