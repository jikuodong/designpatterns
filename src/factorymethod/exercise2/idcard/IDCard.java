package factorymethod.exercise2.idcard;


import factorymethod.exercise2.framework.Product;

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
    private int serial;
    IDCard(String owner, int serial) {
        System.out.println("制作"+ owner+ "("+ serial+")" + "的ID卡。");
        this.owner = owner;
        this.serial = serial;
    }
    @Override
    public void use() {
        System.out.println("使用"+ owner + "("+ serial+")" + "的ID卡。");
    }
    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
