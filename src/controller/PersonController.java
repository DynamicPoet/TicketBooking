package controller;

import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserManagement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class PersonController {
    @RequestMapping(value = "/person")
    public String toPerson(){
        return "person";
    }
    @RequestMapping(value = "/getUserInfo")
    public void getUserInfo(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String username=request.getParameter("username");
        JSONArray jsonArray=JSONArray.fromObject(UserManagement.getUserInfo(username));
        PrintWriter out=response.getWriter();
        out.print(jsonArray);
    }
    @RequestMapping(value = "/updateUser")
    public void updateInfo(HttpServletRequest request,HttpServletResponse response) {
        String username=request.getParameter("username");
        String phone=request.getParameter("phone");
        String sex=request.getParameter("sex");
        String email=request.getParameter("email");
        String name=request.getParameter("name");
        UserManagement.updateUserInfo(username,phone,sex,email,name);
    }

}
