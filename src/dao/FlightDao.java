package dao;

import entity.Flight;

import java.util.List;

public class FlightDao extends BaseDao {


    // 查询全部航班
    public List<Flight> getAll(){
        String sql = "select * from tb_flight";
        List<Flight> flight = super.query(sql, null, Flight.class);
        return flight;
    }

    // 删除
    public void delete(String fnum) {
        String sql = "delete from tb_flight where Fnum=?";
        Object[] paramsValue = {fnum};
        super.update(sql, paramsValue);
    }



}