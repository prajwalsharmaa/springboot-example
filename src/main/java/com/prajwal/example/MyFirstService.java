package com.prajwal.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

//    @Autowired  ##### Field Injection ######
//    @Qualifier("myFirstBean")
    private final MyFirstClass myFirstClass;
//    private Environment environment;  ##### Environment Bean
//    @Autowired   //We no longer need autowired annotation in spring boot . spring boot tries to inject the beans what it can.
//    public MyFirstService( //########## Constructor Injection #########
//            MyFirstClass myFirstClass) {
//        this.myFirstClass = myFirstClass;
//    }


//    @Autowired ######### Method Injection ########
//    public void injectDependencies(
//            @Qualifier("mySecondBean") MyFirstClass myFirstClass
//    ){
//        this.myFirstClass = myFirstClass;
//    }
//    @Autowired // ########## Setter Injection #########
//    public void setMyFirstClass(@Qualifier("myThirdBean") MyFirstClass myFirstClass) {
//        this.myFirstClass = myFirstClass;
//    }
    public String tellAStory(){
        return "the dependency is saying : " + myFirstClass.sayHello();
    }
//
//    public String getJavaVersion(){
//        return environment.getProperty("java.version");
//    }
//    public String getOsName(){
//        return environment.getProperty("os.name");
//    }
//    public String readProp(){
//        return environment.getProperty("my.custom.property");
//    }
    @Autowired
    public MyFirstService(
            @Qualifier("bean1") MyFirstClass myFirstClass)
    {
        this.myFirstClass = myFirstClass;
    }

//    @Autowired
//    public void setEnvironment(Environment environment) {
//        this.environment = environment;
//    }
}
