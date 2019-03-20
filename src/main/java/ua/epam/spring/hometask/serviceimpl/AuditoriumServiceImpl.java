package ua.epam.spring.hometask.serviceimpl;

import ua.epam.spring.hometask.domain.Auditorium;
import ua.epam.spring.hometask.service.AuditoriumService;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Set;

public class AuditoriumServiceImpl implements AuditoriumService {

    private Set<Auditorium> auditoriums;

    public void setAuditoriums(Set<Auditorium> auditoriums) {
        this.auditoriums = auditoriums;
    }

    public Set<Auditorium> getAuditoriums() {
        return auditoriums;
    }

    @Nonnull
    @Override
    public Set<Auditorium> getAll() {
        return this.auditoriums;
    }

    @Nullable
    @Override
    public Auditorium getByName(@Nonnull String name) {
        return null;
    }

    public void init() {
        System.out.println(this.auditoriums);
    }


}
