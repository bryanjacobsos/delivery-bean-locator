package com.example.delivery.bean.locator.component;

import com.example.delivery.bean.locator.model.Log;
import org.springframework.stereotype.Component;

@Component
public class LogElasticSearchDelivererComponent implements Deliverer {
    @Override
    public void deliver(Log log) {
        System.out.println(String.format("ElasticSearch Delivery: %s", log));
    }
}
