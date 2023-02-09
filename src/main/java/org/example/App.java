package org.example;

import org.example.config.Config;
import org.example.model.MessagePrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        MessagePrinter messagePrinter = context.getBean("messagePrinter", MessagePrinter.class);
        messagePrinter.getService().getMessage();
    }
}
