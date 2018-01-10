import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/11/12.
 */
public class JedisTest {

    public static void main(String[] args) {

     /*   Jedis jedis=new Jedis("192.168.25.131",6379);

        jedis.set("a","ddd");
        String a = jedis.get("a");

        System.out.println(a);

        jedis.close();*/


       /* JedisPool jedisPool=new JedisPool("192.168.25.131",6379);

        Jedis resource = jedisPool.getResource();

        String a = resource.get("a");

        System.out.println(a);

        jedisPool.close();*/

        Set<HostAndPort> nodes=new HashSet<>();
        nodes.add(new HostAndPort("192.168.25.131",7001));
        nodes.add(new HostAndPort("192.168.25.131",7002));
        nodes.add(new HostAndPort("192.168.25.131",7003));
        nodes.add(new HostAndPort("192.168.25.131",7004));
        nodes.add(new HostAndPort("192.168.25.131",7005));
        nodes.add(new HostAndPort("192.168.25.131",7006));
        JedisCluster jedisCluster=new JedisCluster(nodes);
      jedisCluster.set("haha", "sdsd");

        String haha = jedisCluster.get("haha");

        System.out.println(haha);

        jedisCluster.close();
    }
}
