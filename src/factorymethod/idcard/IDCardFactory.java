package factorymethod.idcard;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * describe  实现了createProduct方法和registerProduct方法
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName IDCardFactory.java
 * @createTime 2019年07月18日 11:41:00
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners () {
        return owners;
    }
}
