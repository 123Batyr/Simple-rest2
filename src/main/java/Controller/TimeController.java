package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class TimeController {
    @GetMapping("/time")
    public String getYesterdayDateTime
            (@RequestParam(value = "minusDays", defaultValue = "0") int minusDays) {
        LocalDateTime dateTime = LocalDateTime.now().minusDays(minusDays);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        return "Сегодня день нового задания " + formattedDateTime;


    }

}
