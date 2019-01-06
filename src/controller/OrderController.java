package controller;

import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.OrderManagement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class OrderController {
    @RequestMapping(value = "/order")
    public String toOrder(){
        return "order";
    }

    @RequestMapping(value = "/getOrder")
    public void getOrder(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username=request.getParameter("username");
        PrintWriter out=response.getWriter();
        JSONArray jsonArray=JSONArray.fromObject(OrderManagement.getOrder(username));
        out.print(jsonArray);
    }
}
