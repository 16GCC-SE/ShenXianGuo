package cn.gzcc.course.demo07.model;//POJO Plain Object Java Object

import javax.persistence.Entity;
import javax.persistence.Id;


// Model

@Entity
public class User {
    @Id
    private int id;

    private String username ;
    private String password ;
    private String registerDatetime ;
    private String role ;
    private String status ;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegisterDatetime() {
        return registerDatetime;
    }

    public void setRegisterDatetime(String regesterDatetime) {
        this.registerDatetime = registerDatetime;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
