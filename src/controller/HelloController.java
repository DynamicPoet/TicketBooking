package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value = "/index")
    public String EnterIndex(){
        return "index";
    }
    @RequestMapping(value="/homepage")
    public String EnterHome(){
        return "homepage";
    }
}
