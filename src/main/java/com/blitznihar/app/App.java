package com.blitznihar.app;


import com.blitznihar.fibo.Fibonaci;
import com.blitznihar.fibo.IFibonaci;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * Hello world!
 *
 */
// @SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.blitznihar.app", "com.blitznihar.fibo"})
public class App 
{
    // private static Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        ApplicationContext ctx =  new AnnotationConfigApplicationContext(App.class);
        //Fibonaci.print(new Fibonaci().getFiboUntil(10));
        IFibonaci fibonaci = (Fibonaci)ctx.getBean(Fibonaci.class);
        
        Fibonaci.print(fibonaci.getFiboUntil(10));
        // LOGGER.info("{}",fibonaci);
        ((AnnotationConfigApplicationContext)ctx).close();



    }
}
