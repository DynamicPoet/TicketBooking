package service;

import dao.FlightDao;
import entity.Flight;

import java.util.List;

public class FlightManagement {
    public static List<Flight> getFlight(){
        FlightDao flightDao=new FlightDao();
        return flightDao.getAll();
    }
    public static List<Flight> getFlightByFromTo(String from,String to){
        FlightDao flightDao=new FlightDao();
        List<Flight> list=flightDao.getFlightByFromTo(from,to);
        return list;
    }
    public static List<Flight> getFlightByCompany(String company){
        FlightDao flightDao=new FlightDao();
        List<Flight> list=flightDao.getFlightByCompany(company);
        return list;
    }

}
