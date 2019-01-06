package service;

import dao.FlightDao;
import entity.Flight;

import java.util.List;

public class FlightManagement {
    public static List<Flight> getFlight(){
        FlightDao flightDao=new FlightDao();
        return flightDao.getAll();
    }
    public static List<Flight> getFlightByInfo(){
        return null;
    }

}
