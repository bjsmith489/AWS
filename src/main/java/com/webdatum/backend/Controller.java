package com.webdatum.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/api/hello-world")
    public String getHelloWorld(){
        return "HelloWorld";
    }

    @GetMapping("/")
    public String home(){
        return "Home";
    }

    @GetMapping("/api/health")
    public String health() {
        return "Backend is running";
    }
}
