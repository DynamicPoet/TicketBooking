package dao;


import entity.User;

import java.util.List;

public class UserDao extends BaseDao{


    // 增加用户
    public void insert(User user) {
        String sql = "insert into tb_user (username,password) values (?,?)";
        Object[] paramsValue = {user.getUsername(),user.getPassword()};
        super.update(sql, paramsValue);
    }

    // 登录验证用户密码
    public boolean Check(User user) {
        String sql = "select * from tb_user where username like ?";
        List<User> list = super.query(sql, new Object[]{user.getUsername()}, User.class);
        System.out.println(list);
        System.out.println(list.get(0).getPassword());
        Boolean flag;
        if(user.getPassword().equals(list.get(0).getPassword())) flag=true;
        else flag=false;
        return flag;
    }

    // 查询全部
    public List<User> getAll(){
        String sql = "select * from tb_user";
        List<User> list = super.query(sql, null, User.class);
        return list;
    }
    // 检查用户名是否存在
    public boolean IsExistence(String username) {
        String sql = "select * from tb_user where username like ?";
        List<User> list = super.query(sql, new Object[]{username}, User.class);
        return (list!=null&&list.size()>0) ? true : false;
    }
    //根据姓名查询个人信息
    public User findByName(String username){
        String sql = "select * from tb_user where username like ?";
        List<User> list = super.query(sql, new Object[]{username}, User.class);
        return  (list!=null&&list.size()>0) ? list.get(0) : null;
    }
    //更新个人信息
    public void update(User user) {
        String sql = "update tb_user set phone=?,sex=?,email=?,name=? where username like ?";
        Object[] paramsValue = {user.getPhone(),user.getSex(),user.getEmail(),user.getName(),user.getUsername()};
        super.update(sql, paramsValue);
    }


    //--------------------------无用方法
    // 删除
    public void delete(int id) {
        String sql = "delete from admin where id=?";
        Object[] paramsValue = {id};
        super.update(sql, paramsValue);
    }


    // 根据条件查询(主键)
    public User findById(int id){
        String sql = "select * from admin where id=?";
        List<User> list = super.query(sql, new Object[]{id}, User.class);
        return  (list!=null&&list.size()>0) ? list.get(0) : null;
    }
}
