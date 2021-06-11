package test.demo;

import org.springframework.stereotype.Component;

@Component
public class course {
    private int cid;
    private String cname;
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    @Override
    public String toString() {
        return "course [cid=" + cid + ", cname=" + cname + "]";
    }
    public void select(){
        System.out.println("Course selection initiated!");
    }
}
