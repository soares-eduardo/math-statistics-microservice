package com.eduardosoares.serviceMath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class ControllerMath {

    private ServiceMath serviceMath; 

    @Autowired
    public ControllerMath(ServiceMath serviceMath) {
        this.serviceMath = serviceMath;
    }

    @GetMapping("/sum")
    @CrossOrigin(origins = "*") // Format 1,2,3,4,5,6
    public double getSum(@RequestParam final String values) {
        return serviceMath.sum(values);
    }
}
