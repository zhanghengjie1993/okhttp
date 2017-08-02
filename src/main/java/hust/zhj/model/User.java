package hust.zhj.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.*;
/**
 * Created by zhanghj on 2017/8/1.
 */
@Component
@Entity
@Table
public class User implements Serializable {
    private static final long serialVersionUID = -2407677666514147913L;


    @Id
    @GeneratedValue
    private Long id;


    @Column(unique = true)
    private String userName;


    private String password;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
