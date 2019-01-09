package service;

import dao.FlightDao;
import entity.Flight;

import java.util.List;

public class FlightManagement {
    //查询所有航班
    public static List<Flight> getFlight(){
        FlightDao flightDao=new FlightDao();
        return flightDao.getAll();
    }
    //按出发地目的地查询
    public static List<Flight> getFlightByFromTo(String from,String to){
        FlightDao flightDao=new FlightDao();
        List<Flight> list=flightDao.getFlightByFromTo(from,to);
        return list;
    }
    //按航司查询
    public static List<Flight> getFlightByCompany(String company){
        FlightDao flightDao=new FlightDao();
        List<Flight> list=flightDao.getFlightByCompany(company);
        return list;
    }
    //按航班号查询
    public static List<Flight> getFlightByNum(String num) {
        FlightDao flightDao=new FlightDao();
        return flightDao.getFlightByNum(num);
    }
}
