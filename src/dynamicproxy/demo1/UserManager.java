package dynamicproxy.demo1;

/**
 * describe
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName UserManager.java
 * @createTime 2019年09月17日 11:49:00
 */
public interface UserManager {

    public void addUser(String userId, String userName);
    public void delUser(String userId);
    public String findUser(String userId);
    public void modifyUser(String userId, String userName);
}
