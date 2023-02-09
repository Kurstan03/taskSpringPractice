package org.example.model;

import org.example.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author kurstan
 * @created at 09.02.2023 17:23
 */
@Component
@Scope
public class MessagePrinter {

    private Service service;

    public MessagePrinter() {
    }

    public MessagePrinter(Service service) {
        this.service = service;
    }

    public Service getService() {
        return service;
    }
    @Autowired
    @Qualifier("emailService")
    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "MessagePrinter{" +
                "service=" + service +
                '}';
    }
}
