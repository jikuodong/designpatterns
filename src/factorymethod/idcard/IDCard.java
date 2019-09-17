package factorymethod.idcard;

import factorymethod.framework.Product;

/**
 * describe
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName IDCard.java
 * @createTime 2019年07月18日 11:23:00
 */
public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        System.out.println("制作"+ owner + "的ID卡。");
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println("使用"+ owner + "的ID卡。");
    }
    public String getOwner() {
        return owner;
    }
}
