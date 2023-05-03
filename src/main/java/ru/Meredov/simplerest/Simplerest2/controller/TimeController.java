package ru.Meredov.simplerest.Simplerest2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class TimeController {
    @GetMapping("/time")
    public String getYesterdayDateTime(
            @RequestParam(value = "minusDays", defaultValue = "0")
            int minusDays,
            Model model
    ) {
        LocalDateTime dateTime = LocalDateTime.now().minusDays(minusDays);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);

        model.addAttribute("time", formattedDateTime);

        return "time";
    }

}
