package ProxyStudy.StaticProxy;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy(userService);
        proxy.select();
        proxy.update();
    }
}
