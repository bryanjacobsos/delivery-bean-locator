package com.example.delivery.bean.locator;

import com.example.delivery.bean.locator.component.DelivererLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import static com.example.delivery.bean.locator.model.Log.*;

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

        var logs = List.of(
                log("log message from kafka"),
                log("another log message from kafka"),
                log("and yet another log message from kafka")
        );

        // pretend this loop is a consumer getting message
        // there is more logic
        logs.forEach(deliverer::deliver);


    }
}

