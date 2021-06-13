package com.learn.demodb;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface sturepo extends JpaRepository<Student, Integer> {
    ArrayList<Student> findBysname(String sname);

    ArrayList<Student> findBysclass(int sclass);
}
