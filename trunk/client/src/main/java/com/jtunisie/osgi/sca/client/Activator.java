package com.jtunisie.osgi.sca.client;

import com.jtunisie.osgi.sca.IService;
import org.springframework.osgi.extensions.annotation.ServiceReference;

/**
 *
 * @author slim
 */
public class Activator {

    IService service;

    @ServiceReference(filter="(newton.sca.reference=service_cons)")
    public void setService(IService service) {       
        this.service = service;
    }

    public void init() {
        String message = service.getMessage("world!!!!");
        System.out.println(message);
    }
}
