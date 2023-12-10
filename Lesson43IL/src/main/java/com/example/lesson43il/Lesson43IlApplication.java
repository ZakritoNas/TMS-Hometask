package com.example.lesson43il;

import com.example.lesson43il.client.CarClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(clients = {CarClient.class})
public class Lesson43IlApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lesson43IlApplication.class, args);
    }

}
