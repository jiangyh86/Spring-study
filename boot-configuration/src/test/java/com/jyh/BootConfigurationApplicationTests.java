package com.jyh;

import com.jyh.model.Friend;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootConfigurationApplicationTests {
    @Autowired
    private Friend friend;
    @Test
    void contextLoads() {
        System.out.println(String.valueOf(friend));
    }

}
