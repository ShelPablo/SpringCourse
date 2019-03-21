package ua.epam.spring.hometask.domain;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Yuriy_Tkach
 */
public class DomainObject {
    @Value("0")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
