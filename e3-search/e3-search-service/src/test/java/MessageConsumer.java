import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2017/11/15.
 */
public class MessageConsumer {

    public static void main(String[] args) throws IOException {

        //初始化spring容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-active.xml");
        //等待
        System.in.read();
//        System.out.println();
    }
}
