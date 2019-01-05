package entity;

public class User {
    private String username; //账号
    private String password; //密码
    private String phone; //手机
    private String sex; //性别
    private String email; //邮箱
    private String name;//姓名
    public User(String username,String password){
        this.username=username;
        this.password=password;
    }

    public User(String username, String password, String phone, String sex, String email, String name) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.sex = sex;
        this.email = email;
        this.name = name;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() { return sex; }

    public void setSex(String sex) { this.sex = sex; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
