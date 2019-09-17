package dynamicproxy.demo1;

import dynamicproxy.demo1.impl.LogHandler;
import dynamicproxy.demo1.impl.UserManagerImpl;

/**
 * describe
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Client.java
 * @createTime 2019年09月17日 14:22:00
 */
public class Client {
    public static void main(String[] args) {
        LogHandler logHandler = new LogHandler();
        UserManager userManager = (UserManager) logHandler.newProxyInstance(new UserManagerImpl());
//        UserManager userManager = new UserManagerImpl();
        userManager.addUser("11111", "张三");
    }
}
