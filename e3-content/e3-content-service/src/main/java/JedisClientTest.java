import cn.e3mall.common.jedis.JedisClient;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/11/12.
 */
public class JedisClientTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-redis.xml");

        System.out.println("ssssssssss");
        JedisClient bean = con.getBean(JedisClient.class);
        System.out.println("bbbbbbbbbbbb");

        bean.set("haha","sss");
        String haha = bean.get("haha");

        System.out.println(haha);


    }
}
