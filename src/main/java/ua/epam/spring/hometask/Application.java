package ua.epam.spring.hometask;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.epam.spring.hometask.domain.Admin;
import ua.epam.spring.hometask.domain.Auditorium;
import ua.epam.spring.hometask.domain.Profile;


@Configuration
@ComponentScan(basePackages = {"ua.epam.spring.hometask.domain"})
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {

    //    ApplicationContext ctxXml = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext ctxAnn = new AnnotationConfigApplicationContext(Application.class);
    }
/*    @Bean
    //@Scope("prototype")
    public Profile profile() {
        return new Profile();
    }

    @Bean
    public Auditorium room2() {
        return new Auditorium("room5");
    }

    @Bean
    public Admin adminnnn() {
        return new Admin();
    }*/
}
