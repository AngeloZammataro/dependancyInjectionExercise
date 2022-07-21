package it2.develhope.dependencyInjection.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {      //define a component called MyComponent

    //an instance string variable called
    private final String myComponentImmutableName;

    //a constructor that assigns your name to the instance variable
    public MyComponent(){
        System.out.println("MyComponent constructor has been called");
        this.myComponentImmutableName = "Angelo Zammataro";
    }

    //a method getMyComponentName() that returns the value of myComponentImmutableName
    public String getMyComponentImmutableName(){
        System.out.println("MyComponent.getMyComponentName() has been called");
        return myComponentImmutableName; //or myComponentName???????????????????
    }

}
