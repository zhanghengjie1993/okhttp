package hust.zhj.respository;

import hust.zhj.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by zhanghj on 2017/8/2.
 */
@Component
@Repository
public interface UserRep extends JpaRepository<User, Long> {
    public User findByUserName(String username);
}
