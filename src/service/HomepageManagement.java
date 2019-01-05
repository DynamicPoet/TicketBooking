package service;

import dao.UserDao;
import entity.User;

public class HomepageManagement {
    public static boolean checkLogin(User user){
        UserDao userDao=new UserDao();
        Boolean flag;
        if(userDao.Check(user)){
            flag=true;
        }
        else{
            flag=false;
        }
        return flag;
    }
    public static boolean checkUser(String username){
        boolean flag;
        UserDao userDao=new UserDao();
        if(userDao.IsExistence(username)) flag=true;
        else flag=true;
        return flag;
    }
    public static boolean registerUser(User user){
        UserDao userDao =new UserDao();
        userDao.insert(user);
        return true;
    }

}
