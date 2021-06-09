package com.codeup.springblog;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.





    @Controller
    public class HelloController {
        @GetMapping("/hello")
        @ResponseBody
        public String hello(){
            return"Hello from Spring Boot";
        }
    }

