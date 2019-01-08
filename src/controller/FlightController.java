package controller;

import entity.Flight;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.FlightManagement;
import service.OrderManagement;

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
        JSONArray jsonArray=JSONArray.fromObject(FlightManagement.getFlight());
        PrintWriter out=response.getWriter();
        out.print(jsonArray);
    }

    @RequestMapping(value = "/getFlightByFromTo")
    public void getFlightByFromTo(HttpServletRequest request,HttpServletResponse response) throws IOException {
        System.out.println("1:"+request.getParameter("from"));
        List<Flight> list=FlightManagement.getFlightByFromTo(request.getParameter("from"),request.getParameter("to"));
        JSONArray jsonArray=JSONArray.fromObject(list);
        PrintWriter out=response.getWriter();
        out.print(jsonArray);
    }
    @RequestMapping(value = "/getFlightByCompany")
    public void getFlightByCompany(HttpServletRequest request,HttpServletResponse response) throws IOException {
        List<Flight> list=FlightManagement.getFlightByCompany(request.getParameter("company"));
        JSONArray jsonArray=JSONArray.fromObject(list);
        PrintWriter out=response.getWriter();
        out.print(jsonArray);
    }
    @RequestMapping(value = "/createOrder")
    public void createOrder(HttpServletRequest request,HttpServletResponse response){
        String username=request.getParameter("username");
        String num=request.getParameter("num");
        System.out.println("username"+username);
        OrderManagement.createOrder(username,num);
    }
    @RequestMapping(value = "/getFlightByNum")
    public void getFlightByNum(HttpServletRequest request,HttpServletResponse response) throws IOException {
        List<Flight> list=FlightManagement.getFlightByNum(request.getParameter("num"));
        JSONArray jsonArray=JSONArray.fromObject(list);
        PrintWriter out=response.getWriter();
        out.print(jsonArray);
    }
}
