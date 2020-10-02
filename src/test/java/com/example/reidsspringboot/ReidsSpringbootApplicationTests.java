package com.example.reidsspringboot;

import com.example.reidsspringboot.Util.RedisUtil;
import com.example.reidsspringboot.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;


@SpringBootTest
class ReidsSpringbootApplicationTests {
   @Autowired
   private RedisUtil redisUtil;
    @Test
    void contextLoads() {
//        rt.opsForValue().set("key1",new User("mcfeng",24));
            redisUtil.get("aa");
//            System.out.println(rt.opsForValue().get("bb"));
//        RedisConnectionFactory connectionFactory = redisTemplate.gestConnectionFactory();
//        RedisConnection connection = connectionFactory.getConnection();
//        System.out.println(connection.set());

    }

}
