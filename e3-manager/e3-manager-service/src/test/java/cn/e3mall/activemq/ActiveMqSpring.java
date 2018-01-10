package cn.e3mall.activemq;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by Administrator on 2017/11/15.
 */
public class ActiveMqSpring {

    public static void main(String[] args) {

        /*初始化spring容器
        * 从容器中获得jmsTemlate对象
        * 从容器中获得一个Destination对象
        * 发送消息*/

        ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-activemq.xml");

        JmsTemplate jmsTemplate = con.getBean(JmsTemplate.class);

       Destination destination= (Destination) con.getBean("queueDestination");

        jmsTemplate.send(String.valueOf(destination), new MessageCreator() {

            @Override
            public Message createMessage(Session session) throws JMSException {


                return session.createTextMessage("fa  song  xiao  xi");
            }
        });

    }
}
