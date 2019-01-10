import dao.FlightDao;
import dao.OrderDao;
import dao.UserDao;

public class Test {
    public static void main(String[] argv){
        UserDao userDao=new UserDao();
        OrderDao orderDao=new OrderDao();
        FlightDao flightDao=new FlightDao();
        //if(userDao.Check(new entity.User("2","1"))) System.out.println("登录成功"); //登录测试
        //userDao.insert(new entity.User("2","2")); //注册测试
        //if(userDao.IsExistence("3")) System.out.println("存在该用户");
        //userDao.update(new entity.User("1","","122","男","99@qq","寿润阳"));
        //SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        //System.out.println(df.format(new Date()));
    }
}
