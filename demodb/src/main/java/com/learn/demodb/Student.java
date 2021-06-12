package com.learn.demodb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int sid;
    private int sclass;
    private String sname;
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public int getSclass() {
        return sclass;
    }
    public void setSclass(int sclass) {
        this.sclass = sclass;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    @Override
    public String toString() {
        return "Student [sclass=" + sclass + ", sid=" + sid + ", sname=" + sname + "]";
    }
    
}
