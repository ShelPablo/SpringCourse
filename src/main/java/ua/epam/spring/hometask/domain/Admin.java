package ua.epam.spring.hometask.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Admin {
    @Value("cool enough")
    private String cool;

    public Admin() {
        System.out.println("try to call admin constructor");
    }

    public String getCool() {
        return cool;
    }

    public void setCool(String cool) {
        this.cool = cool;
    }
}
