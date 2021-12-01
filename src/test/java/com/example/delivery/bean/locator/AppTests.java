package com.example.delivery.bean.locator;

import com.example.delivery.bean.locator.component.Deliverer;
import com.example.delivery.bean.locator.component.DelivererLocator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.example.delivery.bean.locator.model.Log.log;

@SpringBootTest
class AppTests {

    @Autowired
    DelivererLocator delivererLocator;

    @Test
    void deliverSomeStuff() {

        var logs = List.of(
                log("log message from kafka"),
                log("another log message from kafka"),
                log("and yet another log message from kafka")
        );

        var deliverer = delivererLocator.getDeliverer();

        // pretend the loop is a kafka consumer and we are consuming messages
        for (var log : logs) {
            deliverer.deliver(log);
        }
    }

}
