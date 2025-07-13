package com.cognizant.spring_learn;

import com.cognizant.spring_learn.model.Country;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpringLearnApplicationTests {

    @Test
    void testCountryBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);

        assertEquals("IN", country.getCode());
        assertEquals("India", country.getName());

        ((ClassPathXmlApplicationContext) context).close();
    }
}
