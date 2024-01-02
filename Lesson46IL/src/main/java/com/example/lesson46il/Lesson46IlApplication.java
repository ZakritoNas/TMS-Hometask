package com.example.lesson46il;

import com.example.lesson46il.client.CarClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(clients = {CarClient.class})
public class Lesson46IlApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lesson46IlApplication.class, args);
    }

}
