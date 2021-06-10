package com.codeup.springblog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String helloName(@PathVariable String name){
        return"Hello from Spring Boot to " + name + " in Marco!";
    }
}