package ioc;

public class UserDaoImpl implements UserDao{
    @Override
    public void say() {
        System.out.println("执行！！");
    }
}
