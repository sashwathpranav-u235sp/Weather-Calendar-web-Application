package org.example.fe.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalendarController {

    @Value("${calendar.service.url}")
    private String calendarServiceUrl;



    @GetMapping("/cal")
    public String calendar() {
        return "redirect:"+ calendarServiceUrl +"/calendar";

    }
}