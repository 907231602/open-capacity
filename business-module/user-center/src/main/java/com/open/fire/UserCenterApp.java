package com.open.fire;

import com.open.fire.log.annotation.EnableLogging;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableLogging
@SpringBootApplication
public class UserCenterApp {

    public static void main( String[] args )
    {
        SpringApplication.run(UserCenterApp.class, args);
    }
}
