package observer.demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ProjectName: designpatterns
 * @Package: observer.demo
 * @ClassName: NumberGenerator
 * @Author: JKD
 * @Description: 生成数值的对象抽象类
 * @Date: 2019/11/15 16:52
 * @Version: 1.0
 */
public abstract class NumberGenerator {

    // 保存Observer 们
    private ArrayList<Observer> observers = new ArrayList<>();

    /**
     * 注册 Observer
     * @param observer
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除Observer
     * @param observer
     */
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 向Observer发送通知
     */
    public void notifyObservers() {
        Iterator it = observers.iterator();
        while (it.hasNext()){
            Observer o = (Observer) it.next();
            o.update(this);
        }
    }

    /**
     * 获取数值
     * @return
     */
    public abstract int getNumber();

    /**
     * 生成数值
     */
    public abstract void execute();
}
