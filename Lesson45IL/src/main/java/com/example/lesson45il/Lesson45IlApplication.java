package com.example.lesson45il;

import com.example.lesson45il.client.CarClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(clients = {CarClient.class})
public class Lesson45IlApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lesson45IlApplication.class, args);
    }

}
