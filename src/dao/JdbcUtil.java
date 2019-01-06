package dao;

import java.sql.*;

public class JdbcUtil {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/final";
    static final String USER = "root";
    static final String PASS = "shourunyang"; //改成自己的密码
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("注册驱动成功！");
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("打开链接！");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("注册驱动失败！");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("打开链接失败！");
        }
        return conn;
    }

    public static void closeAll(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            if(con!=null) con.close();
            if(pstmt!=null) pstmt.close();
            if(rs!=null )rs.close();
            System.out.println("关闭成功！");
        } catch (SQLException e) {
            System.out.println("关闭失败！");
            e.printStackTrace();
        }

    }
}
