package zee.com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zulup on 1/19/2018.
 */
@Entity
public class Tasks {
    @Id
    @GeneratedValue
    @Column(name = "tid")
    int tid;

    @Column(name= "uid")
    int uid;

    @Column(name= "des")
    String des;

    public Tasks() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getTid() {

        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }
}
