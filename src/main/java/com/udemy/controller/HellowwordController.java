
package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/say")
public class HellowwordController {
    
    @GetMapping("/abc")
    public String hellowworld(){
        return "hellowworld";
    }
    
      @GetMapping("/entrar")
    public String login(){
        return "login";
    }
    
}
