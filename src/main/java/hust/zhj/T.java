package hust.zhj;

import hust.zhj.model.User;
import hust.zhj.respository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhanghj on 2017/8/2.
 */
@Component
public class T {
    @Autowired
    private User user;
    @Autowired
    private UserRep userRep;

    public void save(){
        user.setUsername("zhangsan");
        user.setPassword("asdfas");
        System.out.println(userRep.save(user).getId());
    }
}
