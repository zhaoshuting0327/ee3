package cn.e3mall.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.jca.cci.connection.ConnectionFactoryUtils;

import javax.jms.*;
import java.io.IOException;

/**
 * Created by Administrator on 2017/11/15.
 */
public class ActiveMqTest {

 /*   //点到点形式发送消息
    public static void main(String[] args) throws JMSException {

        //1.创建一个连接工厂对象，需要制定服务的ip及端口号
        //2.使用工厂对象创建一个Connection对象
        //3.开启连接，调用Connection对象的start方法
        //4.创建session对象
        //5.使用session对象创建一个destination对象（俩种形式queue和topic），现在使用qeue
        //6.使用session对象创建producer对象
        //7.创建一个message对象，可以使用TextMessage
        //8.发送消息
        //9.关闭资源

        ConnectionFactory  connectionFactory=new ActiveMQConnectionFactory("tcp://192.168.25.131:61616");

        Connection connection = connectionFactory.createConnection();

        connection.start();


        //第一个参数是：是否开启事务,如果true开启事务，第二个参数无意义。一般不开启
        //第二个参数：应答模式，自动应答或手动应答，一般自动应答
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        Queue queue = session.createQueue("test-queue");

        MessageProducer producer = session.createProducer(queue);

        TextMessage textMessage=new ActiveMQTextMessage();

      //  textMessage.setText("helleo   ssss");

        TextMessage textMessage1=session.createTextMessage("ddddd");

        producer.send(textMessage);

        producer.close();

        session.close();

        connection.close();





    }*/

 //接收消息
 public static void main(String[] args) throws JMSException, IOException {

     //创建一个ConnectionFactory对象连接MQ服务
     //创建一个连接对象
     //开启连接
     //使用Connection对象创建一个session对象
     //创建一个Destination对象。queue对象
     //使用Session对象创建一个消费者对象
     //接收消息
     //打印结果
     //关闭资源

     ConnectionFactory connectionFactory=new ActiveMQConnectionFactory("tcp://192.168.25.131:61616");

     Connection connection = connectionFactory.createConnection();

     connection.start();

     Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
     Queue queue = session.createQueue("queue://spring-queue");


     MessageConsumer consumer = session.createConsumer(queue);

     consumer.setMessageListener(new MessageListener() {
         @Override
         public void onMessage(Message message) {
             //打印结果
             TextMessage textMessage= (TextMessage) message;

             String text;

             try {
               text=  textMessage.getText();
                 System.out.println(text);
             } catch (JMSException e) {
                 e.printStackTrace();
             }
         }
     });
     //等待接收消息
     System.in.read();

     consumer.close();

     session.close();

     connection.close();

 }

}
