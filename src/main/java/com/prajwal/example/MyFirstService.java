package com.prajwal.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

//    @Autowired  ##### Field Injection ######
//    @Qualifier("myFirstBean")
    private MyFirstClass myFirstClass;
    //@Autowired   We no longer need autowired annotation in spring boot . spring boot tries to inject the beans what it can.
//    public MyFirstService( ########## Constructor Injection #########
//            MyFirstClass myFirstClass) {
//        this.myFirstClass = myFirstClass;
//    }


//    @Autowired ######### Method Injection ########
//    public void injectDependencies(
//            @Qualifier("mySecondBean") MyFirstClass myFirstClass
//    ){
//        this.myFirstClass = myFirstClass;
//    }
    @Autowired // ########## Setter Injection #########
    public void setMyFirstClass(@Qualifier("myThirdBean") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }
    public String tellAStory(){
        return "the dependency is saying : " + myFirstClass.sayHello();
    }


}
