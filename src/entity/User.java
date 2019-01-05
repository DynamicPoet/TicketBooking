package entity;

public class User {
    private String username; //姓名
    private String password; //密码
    private boolean permission; //权限 true管理员 false用户
    private String phone; //手机
    private boolean sex; //性别 true男性 false女性
    private String createTime; //账号注册时间
    private String email; //邮箱
    public User(String username,String password,boolean permission){
        this.username=username;
        this.password=password;
        this.permission=permission;
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

    public boolean isPermission() {
        return permission;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
