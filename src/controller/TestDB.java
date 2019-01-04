package controller;

import dao.DBUtils.DBUtils;
import dao.implement.ProcedureDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DBUtils dbUtils=new DBUtils();
        Connection conn=dbUtils.getConnection();
        ProcedureDao procedureDao=new ProcedureDao();
        try {
            procedureDao.procedure(conn);
            Statement stmt=conn.createStatement();
            String sql="select * from test";
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString("id")+" "+rs.getString("name")+" "+rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
