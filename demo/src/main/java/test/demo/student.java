package test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class student {
    private int sid;
    private String sname;
    private double sw;
    @Autowired
    private course cor;
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public course getCor() {
        return cor;
    }
    public void setCor(course cor) {
        this.cor = cor;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public double getSw() {
        return sw;
    }
    public void setSw(double sw) {
        this.sw = sw;
    }
    public void work(){
        System.out.println("First thing working");
        cor.select();
    }
}
