package service;

import dao.OrderDao;
import entity.Order;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class OrderManagement {
    //查询用户所有订单
    public static List<Order>getOrder(String username){
        OrderDao orderDao=new OrderDao();
        return orderDao.FindOrderByUsername(username);
    }
    //按创建时间查询
    public static List<Order>getOrderByTime(String time,String username){
        OrderDao orderDao=new OrderDao();
        return orderDao.FindOrderByTime(time,username);
    }
    //按航班号查询
    public static List<Order>getOrderByNum(String num,String username){
        OrderDao orderDao=new OrderDao();
        return orderDao.FindOrderByNum(num,username);
    }
    //创建订单
    public static void createOrder(String username,String num){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String createTime = df.format(new Date());
        OrderDao orderDao=new OrderDao();
        Order order=new Order(username,num,createTime);
        orderDao.insert(order);
    }
}
