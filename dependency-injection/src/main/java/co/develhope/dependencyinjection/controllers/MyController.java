package co.develhope.dependencyinjection.controllers;

import co.develhope.dependencyinjection.services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//define a controller called MyController
@RestController
public class MyController {

    //a private variable MyService
    private final MyService service;

    //a constructor
    public MyController(MyService service) {
        System.out.println("MyController constructor has been called");
        this.service = service;
    }

    //a mapping to /getName in order to return
    //the result of the getName() method of the MyService variable
    @GetMapping("/getName")
    public String getName(){
        return service.getName();
    }

    //a mapping to default root / that prints a welcome message
    @GetMapping
    public String helloMsg(){
        return "Welcome to my app";
    }



}
