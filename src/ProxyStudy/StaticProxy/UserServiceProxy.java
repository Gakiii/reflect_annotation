package ProxyStudy.StaticProxy;

public class UserServiceProxy {
    private UserService userService;

    public  UserServiceProxy(){}

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    public void select() {
        before();
        userService.select();
        after();
    }

    public void update() {
        before();
        userService.update();
        after();
    }


    private void before() {
        System.out.println("调用之前");
    }

    private void after() {
        System.out.println("调用之后");
    }
}
