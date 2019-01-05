package controller;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class HomePageController {
    @RequestMapping(value="/homepage")
    public String toHomePage(){
        return "homepage";
    }
    @RequestMapping(value = "/login")
    public void checkLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("checkLogin");
        PrintWriter out=response.getWriter();
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        JSONObject json=new JSONObject();
        if(username.equals("1")&&(password.equals("1"))){
            json.put("result","success");
        }
        else{
            json.put("result","error");
        }
        out.print(json);
    }


}
