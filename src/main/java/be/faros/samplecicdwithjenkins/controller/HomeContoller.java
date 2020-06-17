package be.faros.samplecicdwithjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeContoller {

    @GetMapping
    public String home() {
        return "Welcome Home";
    }

}
