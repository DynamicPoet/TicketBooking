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
            conn=DriverManager.getConnection(DB_URL,USER,PASS);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeAll(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            if(con!=null) con.close();
            if(pstmt!=null) pstmt.close();
            if(rs!=null )rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
