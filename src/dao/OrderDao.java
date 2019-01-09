package dao;

import entity.Order;

import java.util.List;

public class OrderDao extends BaseDao {

    // 增加订单
    public void insert(Order order) {
        String sql = "insert into tb_order values (null,?,?,?)";
        Object[] paramsValue = {order.getUsername(),order.getNum(),order.getCreateTime()};
        super.update(sql, paramsValue);
    }

    // 查询本人全部订单
    public List<Order> FindOrderByUsername(String username){
        String sql = "select * from tb_order where username like ?";
        List<Order> list = super.query(sql, new Object[]{username}, Order.class);
        return  list;
    }

    //按时间查询
    public List<Order> FindOrderByTime(String createtime,String username){
        String sql = "select * from tb_order where createTime like ? and username like ?";
        List<Order> list = super.query(sql, new Object[]{createtime,username}, Order.class);
        return  list;
    }

    //按航班号查询
    public List<Order> FindOrderByNum(String num,String username){
        String sql = "select * from tb_order where num like ? and username like ?";
        List<Order> list = super.query(sql, new Object[]{num,username}, Order.class);
        return  list;
    }

    //删除订单
    public void delete(int id) {
        String sql = "delete from tb_order where id =?";
        Object[] paramsValue = {id};
        super.update(sql, paramsValue);
    }
}
