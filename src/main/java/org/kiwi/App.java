package org.kiwi;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.kiwi.repositories.HelloService;
import org.kiwi.repositories.MyHelloService;

public class App extends ResourceConfig {
    public App() {
        packages("org.kiwi.resources");

        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(MyHelloService.class).to(HelloService.class);
            }
        });
    }
}
