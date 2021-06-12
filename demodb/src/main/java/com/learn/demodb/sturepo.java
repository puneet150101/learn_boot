package com.learn.demodb;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

public interface sturepo extends CrudRepository<Student,Integer>{
    ArrayList<Student>  findBysname(String sname);
    ArrayList<Student>  findBysclass(int sclass);
}
