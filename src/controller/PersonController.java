package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {
    @RequestMapping(value = "/person")
    public String toPerson(){
        return "person";
    }
}
