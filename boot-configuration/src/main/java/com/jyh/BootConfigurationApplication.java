package com.jyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author jiangyiheng
 */
@SpringBootApplication
//@ImportResource(locations = {"classpath:bean.xml","classpath:bean1.xml"})
public class BootConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootConfigurationApplication.class, args);
    }

}
