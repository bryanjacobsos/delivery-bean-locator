package com.example.delivery.bean.locator.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DelivererLocator {

    /**
     * What is this thing?
     * It's the object in spring that contains all the beans that can be injected.
     * Our Deliverer beans are in this object so we can look them up from here
     */
    @Autowired
    ApplicationContext applicationContext;

    @Value("${log.deliverer}")
    private String logsDeliverer;

    private Deliverer deliverer;

    public Deliverer getDeliverer() {
        return deliverer;
    }

    @PostConstruct
    void lookupDeliverer() {

        deliverer = (Deliverer) applicationContext.getBean(logsDeliverer);

        System.out.println(deliverer);
    }
}
