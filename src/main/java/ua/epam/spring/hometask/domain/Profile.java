package ua.epam.spring.hometask.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Profile {

    private Admin adminnnn;

    private Auditorium auditorium;

    public Profile() {
    }

    @Qualifier("room2")
    @Autowired
    private Auditorium room1;

    private Auditorium room2;

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public Profile(Admin adminnnnn) {
        this.adminnnn = adminnnnn;
    }
    @PostConstruct
    private  void init() {
        System.out.println("this is profile");
//        System.out.println(this.auditorium.getName());
//        System.out.println("admin = "+this.adminnnn.getCool());
        System.out.println("room1: " + this.room1.getName());
//        System.out.println("room2: " + this.room2.getName());

    }
    @PreDestroy
    void bye() {
        System.out.println("bye-bye");
    }



}
