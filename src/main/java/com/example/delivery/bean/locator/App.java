package com.example.delivery.bean.locator;

import com.example.delivery.bean.locator.component.DelivererLocator;
import com.example.delivery.bean.locator.model.Logs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    DelivererLocator delivererLocator;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) {

        var deliverer = delivererLocator.getDeliverer();

        deliverer.deliver(Logs.logs("a message that came from a kafka topic"));

    }
}

