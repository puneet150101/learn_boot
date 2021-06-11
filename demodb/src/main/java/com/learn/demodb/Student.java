package com.learn.demodb;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {
    @Id
    private int sid;
    private String sname;
    private int sclass;
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
