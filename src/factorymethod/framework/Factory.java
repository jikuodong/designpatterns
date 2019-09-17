package factorymethod.framework;

/**
 * describe 该类声明了用于“生成产品”的createProduct抽象方法和用于“注册产品”
 *          的registerProduct抽象方法。“生成产品”和“注册产品”的具体处理责备交给了Factory类的子类处理。
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Factory.java
 * @createTime 2019年07月18日 10:55:00
 */
public abstract class Factory {

    // 生成产品实例
    public  final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected  abstract  Product createProduct(String owner);
    protected  abstract void registerProduct(Product product);
}
