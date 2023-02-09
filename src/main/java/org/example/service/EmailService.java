package org.example.service;

import org.springframework.stereotype.Component;

/**
 * @author kurstan
 * @created at 09.02.2023 17:24
 */
@Component
public class EmailService implements Service{
    @Override
    public void getMessage() {
        System.out.println("Message with email");
    }
}
