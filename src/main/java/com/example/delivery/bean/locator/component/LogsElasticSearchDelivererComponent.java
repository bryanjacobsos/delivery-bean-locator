package com.example.delivery.bean.locator.component;

import com.example.delivery.bean.locator.model.Logs;
import org.springframework.stereotype.Component;

@Component
public class LogsElasticSearchDelivererComponent implements Deliverer {
    @Override
    public void deliver(Logs logs) {
        System.out.println("delivery to elasticsearch");
    }
}
