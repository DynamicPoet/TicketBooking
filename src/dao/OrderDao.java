package dao;

import entity.Order;

import java.util.List;

public class OrderDao extends BaseDao {

    // 增加订单
    public void insert(Order order) {
        String sql = "insert into tb_order (Uuser,Fnum,Oct) values (?,?,?)";
        Object[] paramsValue = {order.getUsername(),order.getNum(),order.getCreateTime()};
        super.update(sql, paramsValue);
    }


    // 查询本人全部订单
    public List<Order> FindOrderByUsername(String username){
        String sql = "select * from tb_order where Uuser=?";
        List<Order> list = super.query(sql, new Object[]{username}, Order.class);
        return  list;
    }
}
