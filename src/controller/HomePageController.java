package controller;

import entity.User;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.HomepageManagement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class HomePageController {
    @RequestMapping(value="/homepage")
    public String toHomePage(){
        return "homepage";
    }

    @RequestMapping(value = "/login")
    public void checkUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("checkLogin");
        PrintWriter out=response.getWriter();
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        JSONObject json=new JSONObject();
        HttpSession session=request.getSession();
        session.setAttribute("username",username);
        if(username.equals("1")&&password.equals("1")){
            json.put("result","success");
        }
        else{
            json.put("result","error");
        }
        out.print(json);
    }

    @RequestMapping(value = "/register")
    public void registerUser(HttpServletRequest request,HttpServletResponse response) throws IOException {
        System.out.println("register");
        PrintWriter out=response.getWriter();
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        JSONObject json=new JSONObject();
        if(HomepageManagement.registerUser(new User(username,password))){
            json.put("result","success");
        }
        else{
            json.put("result","error");
        }
        out.print(json);
    }

    @RequestMapping(value = "/check")
    public void userCheck(HttpServletRequest request,HttpServletResponse response) throws IOException {
        System.out.println("check");
        PrintWriter out=response.getWriter();
        String username=request.getParameter("name");
        JSONObject json=new JSONObject();
        if(HomepageManagement.checkUser(username)){
            json.put("result","ok");
        }
        else{
            json.put("result","error");
        }
        out.print(json);
    }

    @RequestMapping(value = "/judge")
    public void loginJudge(HttpServletRequest request,HttpServletResponse response) throws IOException {
        HttpSession session=request.getSession();
        PrintWriter out=response.getWriter();
        System.out.println(session.getAttribute("username"));
        out.print(session.getAttribute("username"));
    }
}
