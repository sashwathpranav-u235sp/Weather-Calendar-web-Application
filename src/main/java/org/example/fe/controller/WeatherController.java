package org.example.fe.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherController {

    @Value("${weather.service.url}")
    private String weatherServiceUrl;


    @GetMapping("/weather")
    public String weather() {
        return "redirect:" + weatherServiceUrl +"/weather";
    }
}
