package org.kiwi.repositories;

public class MyHelloService implements HelloService {
    @Override
    public String sayHello() {
        return "this is my hello";
    }
}
