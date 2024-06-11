package com.pp.learning;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "helloworld");
        return "helloworld";
    }
    
    @GetMapping("/style")
    public String style(Model model) {
        model.addAttribute("message", "helloworld");
        return "add-css-js-demo";
    }

    @GetMapping("/bootstrap")
    public String bootstrap(Model model) {
        return "add-bootstrap-demo";
    }


}

