package com.example.delivery.bean.locator.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DelivererLocator {

    @Autowired
    ApplicationContext applicationContext;

    @Value("${logs.deliverer}")
    private String logsDeliverer;

    private Deliverer deliverer;

    public Deliverer getDeliverer() {
        return deliverer;
    }

    @PostConstruct
    public void lookupDeliverer() {

        deliverer = (Deliverer) applicationContext.getBean("logsHttpDeliveryComponent");

        System.out.println(deliverer);
    }
}
