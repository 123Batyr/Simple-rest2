package ru.Meredov.simplerest.Simplerest2.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name" , required = false ,defaultValue = "Ekb") String name, Model model) {
        model.addAttribute("name" , name);
        return "greeting";
    }
}
