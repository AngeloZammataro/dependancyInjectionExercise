package co.develhope.dependencyinjection.services;

import co.develhope.dependencyinjection.components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {//define a service called MyService

    //a private variable MyComponent
    private final MyComponent myComponent;


    //constructor-based dependency injection
    @Autowired
    public MyService(MyComponent myComponent){
        System.out.println("MyService constructor has been called");
        this.myComponent = myComponent;
    }


    //a method getName() that calls and returns getMyComponentName()
    public String getName(){
        System.out.println("MyService.getName() has been called");
        return myComponent.getMyComponentName();
    }

}
