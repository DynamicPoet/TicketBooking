package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FlightController {
    @RequestMapping(value = "/flight")
    public String toFlight(){
        return "flight";
    }
}
