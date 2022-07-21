package co.develhope.dependencyinjection.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {      //define a component called MyComponent

    //an instance string variable called
    private final String myComponentName;

    //a constructor that assigns your name to the instance variable
    public MyComponent(){
        System.out.println("MyComponent constructor has been called");
        this.myComponentName = "Angelo Zammataro";
    }

    //a method getMyComponentName() that returns the value of myComponentImmutableName
    public String getMyComponentName(){
        System.out.println("MyComponent.getMyComponentName() has been called");
        return myComponentName; //myComponentImmutableName???????????????????
    }

}
