package ua.epam.spring.hometask.domain;

import org.springframework.stereotype.Component;

@Component
public class Admin {

    private String cool;

    public String getCool() {
        return cool;
    }

    public void setCool(String cool) {
        this.cool = cool;
    }
}
