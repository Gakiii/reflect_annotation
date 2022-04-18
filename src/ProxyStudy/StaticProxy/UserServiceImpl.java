package ProxyStudy.StaticProxy;

public class UserServiceImpl implements UserService{
    @Override
    public void select() {
        System.out.println("实现select");
    }

    @Override
    public void update() {
        System.out.println("实现update");
    }
}
