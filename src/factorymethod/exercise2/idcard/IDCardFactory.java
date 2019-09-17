package factorymethod.exercise2.idcard;

import factorymethod.exercise2.framework.Factory;
import factorymethod.exercise2.framework.Product;

import java.util.HashMap;

/**
 * describe  实现了createProduct方法和registerProduct方法
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName IDCardFactory.java
 * @createTime 2019年07月18日 11:41:00
 */
public class IDCardFactory extends Factory {
    private HashMap database = new HashMap();
    private  int serial = 100;
    @Override
    protected synchronized IDCard createProduct(String owner) {
        return new IDCard(owner,serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        database.put(new Integer(card.getSerial()), card.getOwner());
    }

    public HashMap getDatabase () {
        return database;
    }
}
