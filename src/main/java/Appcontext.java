import hust.zhj.T;
import hust.zhj.config.AppConfig;
import hust.zhj.config.PersistenceJPAConfig;
import hust.zhj.model.User;
import hust.zhj.respository.UserRep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by zhanghj on 2017/8/1.
 */
@ComponentScan(basePackageClasses = {AppConfig.class,PersistenceJPAConfig.class})
public class Appcontext {

//    private static final Logger LOGGER = LoggerFactory.getLogger(Appcontext.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        ctx.scan("hust.zhj");
        UserRep userRep = ctx.getBean(UserRep.class);
        User user = new User();
        user.setUsername("ASDdfsdfsadsasddfdf");
        user.setPassword("password");
        System.out.println(userRep.save(user).getId());
        System.out.println("sucess");
        T t = ctx.getBean(T.class);
//        t.save();
        Logger logger = LoggerFactory.getLogger(Appcontext.class);
        logger.info("测试成功",t);
    }

}
