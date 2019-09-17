package dynamicproxy.demo;

/**
 * describe 代理是一种设计模式，起作用是对原方法进行增强，并且不具侵入性。比如一个接口提供某个服务
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Service.java
 * @createTime 2019年09月04日 10:55:00
 */
public interface Service {
    public void service(String[] args);
}
