package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserManagement;

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
    public void loginUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out=response.getWriter();
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if(UserManagement.checkLogin(username,password)){
            HttpSession session=request.getSession();
            session.setAttribute("username",username);
            out.print("success");
        }
        else{
            out.print("error");
        }

    }

    @RequestMapping(value = "/register")
    public void registerUser(HttpServletRequest request,HttpServletResponse response) throws IOException {
        PrintWriter out=response.getWriter();
        if(UserManagement.registerUser(request.getParameter("username"),request.getParameter("password"))){
            out.print("ok");
            }
        else{
            out.print("error");
        }
    }

    @RequestMapping(value = "/check")
    public void userCheck(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String username=request.getParameter("name");
        PrintWriter out=response.getWriter();
        if(UserManagement.checkUser(username)){
            out.print("error");
        }
        else{
            out.print("ok");
        }


    }

    @RequestMapping(value = "/judge")
    public void loginJudge(HttpServletRequest request,HttpServletResponse response) throws IOException {
        HttpSession session=request.getSession();
        PrintWriter out=response.getWriter();
        out.print(session.getAttribute("username"));
    }

    @RequestMapping(value = "/logout")
    public void logout(HttpServletRequest request,HttpServletResponse response){
        HttpSession session=request.getSession();
        session.removeAttribute("username");
    }
}
