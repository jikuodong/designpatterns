package prototype.framework;

import java.util.HashMap;

/**
 * describe 使用Product接口来复制实例
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Manager.java
 * @createTime 2019年07月18日 16:43:00
 */
public class Manager {

    private HashMap showcase = new HashMap();

    public void register(String name,  Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product p = (Product) showcase.get(protoname);
        return  p.createClone();
    }

}
