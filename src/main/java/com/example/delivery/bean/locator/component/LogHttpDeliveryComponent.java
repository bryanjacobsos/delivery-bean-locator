package com.example.delivery.bean.locator.component;

import com.example.delivery.bean.locator.model.Log;
import org.springframework.stereotype.Component;

/**
 * spring registers this bean with the name:
 * logHttpDeliveryComponent <-- notice that its lower case
 */
@Component
public class LogHttpDeliveryComponent implements Deliverer {
    @Override
    public void deliver(Log log) {
        System.out.println(String.format("Http Delivery: %s", log));
    }
}
