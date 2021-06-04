package com.eduardosoares.serviceStatistics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/statistics")
public class ControllerStatistics {

    private ServiceStatistics serviceStatistics;

    @Autowired
    public ControllerStatistics(ServiceStatistics serviceStatistics){
        this.serviceStatistics = serviceStatistics;
    }
    
    @GetMapping("/avg")
    @CrossOrigin(origins = "*")
    public double avg(@RequestParam final String values) {
        return serviceStatistics.avg(values);
    }
}