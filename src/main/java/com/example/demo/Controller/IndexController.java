package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/ji")
    public  String ji() {
        return "ji";
    }
    @GetMapping("/doo")
    public  String doo() {
        return "doo";
    }
    @GetMapping("/youngju")
    public  String youngju() {
        return "youngju";
    }
    @GetMapping("/so")
    public  String so() {
        return "so";
    }
    @GetMapping("/index")
    public  String index() {
        return "index";
    }
}
