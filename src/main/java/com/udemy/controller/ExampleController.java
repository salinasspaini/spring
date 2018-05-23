
package com.udemy.controller;

import java.util.ArrayList;
import java.util.List;
import model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/example")
public class ExampleController {
    
    public static final String EXAMPLE_VIEW = "example";
    
    //Primera forma
    @GetMapping("/exampleString")
    public String exampleString(Model model){
         model.addAttribute("people", getPeople());
        return EXAMPLE_VIEW;
        
    }
    
    //segunda forma
      @GetMapping("/acceso")
    public ModelAndView exampleMAV(Model model){
        
        ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
        mav.addObject("people", getPeople());
          
              
        return mav;
        
    }
    
    private List<Person> getPeople(){
        List<Person> people = new  ArrayList<>();
        people.add(new Person("Daniel",24));
        people.add(new Person("fernando",24));
        people.add(new Person("ariel",24));
        return people;
    }
    
    
    
}
