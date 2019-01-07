package dao;

import entity.Flight;

import java.util.List;

public class FlightDao extends BaseDao {


    // 查询全部航班
    public List<Flight> getAll(){
        String sql = "select * from tb_flight";
        List<Flight> list = super.query(sql, null, Flight.class);
        return list;
    }

    //按出发地目的地查询航班
    public List<Flight> getFlightByFromTo(String from,String to){
        String sql="select * from tb_flight where from like ? and to like ?";
        Object[] paramsValue={from,to};
        List<Flight> list=super.query(sql,paramsValue,Flight.class);
        return list;
    }

    //按航司查询
    public List<Flight> getFlightByCompany(String company){
        String sql="select * from tb_flight where company like ?";
        List<Flight> list=super.query(sql,new Object[]{company},Flight.class);
        return list;
    }


    // 删除
    public void delete(String fnum) {
        String sql = "delete from tb_flight where num like ?";
        Object[] paramsValue = {fnum};
        super.update(sql, paramsValue);
    }



}
