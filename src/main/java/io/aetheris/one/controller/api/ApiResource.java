package io.aetheris.one.controller.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiResource {

    @GetMapping("/hello")
    public String sayHello() {
        Logger log  = LogManager.getLogger();
        log.info("here");
        return "Hello from Spring MVC!";
    }

    @PostMapping("/echo")
    public String echoMessage(@RequestBody String message) {
        return "You said: " + message;
    }

}
