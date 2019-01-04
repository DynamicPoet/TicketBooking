package dao.implement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class ProcedureDao {
    public boolean procedure(Connection conn) throws SQLException {
        String procStr="{call insertUser(?,?,?)}";
        CallableStatement callableStatement=conn.prepareCall(procStr);
        callableStatement.setString(1,"5");
        callableStatement.setString(2,"sss");
        callableStatement.setString(3,"rrr");
        callableStatement.execute();
        return false;
    }
}
