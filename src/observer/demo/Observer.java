package observer.demo;

/**
 * @ProjectName: designpatterns
 * @Package: observer.demo
 * @ClassName: Observer
 * @Author: JKD
 * @Description: 观察者的接口
 * @Date: 2019/11/15 16:51
 * @Version: 1.0
 */
public interface Observer {
    public abstract void update(NumberGenerator generator);
}
