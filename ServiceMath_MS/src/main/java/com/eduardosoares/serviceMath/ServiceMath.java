package com.eduardosoares.serviceMath;

import org.springframework.stereotype.Component;

@Component
public class ServiceMath {

    public double sum(String values) {

        String[] numbers = values.split(",");

        double sum = 0.0;

        for (String n : numbers) {
            sum += Double.parseDouble(n);
        }
        return sum;
    }
}
