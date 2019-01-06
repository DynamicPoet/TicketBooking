package controller;

import entity.Flight;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.FlightManagement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class FlightController {
    @RequestMapping(value = "/flight")
    public String toFlight(){
        return "flight";
    }
    @RequestMapping(value = "/getFlight")
    public void getFlight(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Flight> list=FlightManagement.getFlight();
        JSONArray jsonArray=JSONArray.fromObject(list);
        PrintWriter out=response.getWriter();
        out.print(jsonArray);
    }

    @RequestMapping(value = "/getFlightByInfo")
    public void getFlightByFromTo(HttpServletRequest request,HttpServletResponse response){

    }
    @RequestMapping(value = "/createOrder")
    public void createOrder(HttpServletRequest request,HttpServletResponse response){

    }
}
