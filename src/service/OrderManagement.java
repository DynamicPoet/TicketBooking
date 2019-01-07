package service;

import dao.OrderDao;
import entity.Order;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class OrderManagement {
    public static List<Order>getOrder(String username){
        OrderDao orderDao=new OrderDao();
        return orderDao.FindOrderByUsername(username);
    }
    public static List<Order>getOrderByTime(String time){
        OrderDao orderDao=new OrderDao();
        return orderDao.FindOrderByTime(time);
    }
    public static List<Order>getOrderByNum(String num){
        OrderDao orderDao=new OrderDao();
        return orderDao.FindOrderByNum(num);
    }
    public static void createOrder(String username,String num){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String createTime = df.format(new Date());
        OrderDao orderDao=new OrderDao();
        Order order=new Order(username,num,createTime);
        orderDao.insert(order);
    }
}
