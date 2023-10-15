package config;

import domain.Horse;
import domain.Pair;
import domain.Rider;
import domain.Wallet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = "service")
public class AppConfig {
    @Bean
    Horse horse1(){
        return new Horse("Kesya");
    }
    @Bean
    Horse horse2(){
        return new Horse("Ymka");
    }
    @Bean
    Horse horse3(){
        return new Horse("Night");
    }
    @Bean
    Rider rider1(){
        return new Rider("Dasha");
    }
    @Bean
    Rider rider2(){
        return new Rider("Nastya");
    }
    @Bean
    Rider rider3(){
        return new Rider("Pasha");
    }

    @Bean
    Pair pair1(Rider rider1, Horse horse1){
        return new Pair(rider1, horse1);
    }
    @Bean
    Pair pair2(Rider rider2, Horse horse2){
        return new Pair(rider2, horse2);
    }
    @Bean
    Pair pair3(Rider rider3, Horse horse3){
        return new Pair(rider3, horse3);
    }

    @Bean
    Wallet wallet (){
        return new Wallet();
    }
}
