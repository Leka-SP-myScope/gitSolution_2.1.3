package app.config;

import app.model.AnimalsCage;
import app.model.Cat;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean
    public AnimalsCage animalsCage() {
        return new AnimalsCage();
    }

    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public Timer getTimer() {
        return new Timer();
    }
}