package service;

import dao.OrderDao;
import entity.Order;

import java.util.List;

public class OrderManagement {
    public static List<Order>getOrder(String username){
        OrderDao orderDao=new OrderDao();
        return orderDao.FindOrderByUsername(username);
    }
    public static void createOrder(Order order){
        OrderDao orderDao=new OrderDao();
        orderDao.insert(order);
    }
}
