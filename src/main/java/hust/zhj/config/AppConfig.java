package hust.zhj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by zhanghj on 2017/8/1.
 */
@Configuration
@ComponentScan(basePackages = {"hust.zhj"})
@EnableJpaRepositories(basePackages = {"hust.zhj.respository"})
public class AppConfig {

}
