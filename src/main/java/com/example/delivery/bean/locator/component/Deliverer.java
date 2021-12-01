package com.example.delivery.bean.locator.component;

import com.example.delivery.bean.locator.model.Log;

/**
 * this is used to allow a polymorphic lookup of different delivery destinations
 *
 * Spring cannot dynamically @Autowired or inject at runtime
 *
 * What that means is that
 *
 */
public interface Deliverer {

    void deliver(Log log);

}
