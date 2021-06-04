package com.eduardosoares.serviceStatistics;

import org.springframework.stereotype.Component;

@Component
public class ServiceStatistics {

    public double avg(String values) {

        String[] numbers = values.split(",");

        double sum = 0.0;

        int amount = numbers.length;

        for (String number : numbers) {
            sum += Double.parseDouble(number);
        }

        return sum / amount;
    }
}