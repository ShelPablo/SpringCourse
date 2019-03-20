package ua.epam.spring.hometask.terminal;

import org.springframework.stereotype.Component;
import ua.epam.spring.hometask.service.AuditoriumService;
import ua.epam.spring.hometask.service.BookingService;
import ua.epam.spring.hometask.service.EventService;
import ua.epam.spring.hometask.service.UserService;

public class Terminal {

    AuditoriumService auditoriumService;

    BookingService bookingService;

    EventService eventService;

    UserService userService;

    private void start() {
        auditoriumService.getAll();
        //bookingService.getTicketsPrice();
        eventService.getAll();
        userService.getAll();






    }




}
