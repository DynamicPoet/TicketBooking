package dao.DBUtils;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils{
    private static DataSource ds=null;
    public static DataSource getDataSource() throws Exception {
        long start=System.currentTimeMillis();
        if(ds==null){
            Context initContext=new InitialContext();
            if(initContext==null) throw new Exception("No Context");
            Context envContext=(Context)initContext.lookup("java:/comp/env");
            ds=(DataSource)envContext.lookup("jdbc/bookDB");
            long end=System.currentTimeMillis();
            System.out.println(end-start);
        }
        return ds;
    }

    public Connection getConnection() {
        try{
            Connection conn=getDataSource().getConnection();
            if(conn!=null) return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void close(ResultSet rs, Statement stat, Connection conn) {
        try{
            if(rs!=null) rs.close();
            if(stat!=null) stat.close();
            if(conn!=null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
