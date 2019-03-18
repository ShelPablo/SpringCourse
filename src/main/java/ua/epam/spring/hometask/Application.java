package ua.epam.spring.hometask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.epam.spring.hometask.domain.Auditorium;

public class Application {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        Auditorium auditorium =  (Auditorium)ctx.getBean("room1");
        System.out.println(auditorium.getName());
        System.out.println(auditorium.getNumberOfSeats());

    }

}
