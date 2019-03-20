package ua.epam.spring.hometask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.epam.spring.hometask.domain.Auditorium;
import ua.epam.spring.hometask.domain.Profile;



public class Application {
    public static void main(String[] args) {

        ApplicationContext ctxXml = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext ctxAnn = new AnnotationConfigApplicationContext(AppConfig.class);
    }



}
