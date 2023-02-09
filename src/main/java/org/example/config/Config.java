package org.example.config;

import org.example.model.MessagePrinter;
import org.example.service.EmailService;
import org.example.service.SMSService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author kurstan
 * @created at 09.02.2023 17:22
 */
@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:application.properties")
public class Config {
    @Bean
    public MessagePrinter messagePrinter(){
        return new MessagePrinter(new EmailService());
    }
    @Bean
    public EmailService emailService(){
        return new EmailService();
    }
    @Bean
    public SMSService smsService(){
        return new SMSService();
    }
}
