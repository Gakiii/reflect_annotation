package ProxyStudy.DynamicProxy;

import ProxyStudy.StaticProxy.UserService;
import ProxyStudy.StaticProxy.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        ClassLoader classLoader = userServiceImpl.getClass().getClassLoader();
        Class[] interfaces = userServiceImpl.getClass().getInterfaces();
        InvocationHandler logHander = new LogHandler(userServiceImpl);
        UserService proxy = (UserService) Proxy.newProxyInstance(classLoader, interfaces, logHander);
        proxy.select();
        proxy.update();
    }
}
