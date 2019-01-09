package service;

import dao.UserDao;
import entity.User;

public class UserManagement {
    //登录验证
    public static boolean checkLogin(String username,String password){
        UserDao userDao=new UserDao();
        Boolean flag;
        if(userDao.IsExistence(username)){
            if(userDao.Check(new User(username,password))){ flag=true; }
            else{ flag=false; }
        }
        else{
            flag=false;
        }
        return flag;
    }
    //是否存在用户
    public static boolean checkUser(String username){
        boolean flag;
        UserDao userDao=new UserDao();
        if(userDao.IsExistence(username)) flag=true;
        else flag=false;
        return flag;
    }
    //注册
    public static boolean registerUser(String username,String password){
        UserDao userDao =new UserDao();
        userDao.insert(new User(username,password));
        return true;
    }
    //获取用户信息
    public static User getUserInfo(String username){
        UserDao userDao=new UserDao();
        return userDao.findByName(username);
    }
    //更新用户信息
    public static void updateUserInfo(String username,String phone,String sex,String email,String name){
        User user=new User(username,"",phone,sex,email,name);
        UserDao userDao=new UserDao();
        userDao.update(user);
    }

}
