package prototype.framework;

/**
 * describe 复制功能的接口
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Product.java
 * @createTime 2019年07月18日 16:24:00
 */
public interface Product extends Cloneable {
    /**
     * describe 用于“使用”的方法，具体怎么“使用”，则被交给子类去实现
     *
     * @return void
     * @data 2019/7/18 16:34
     */
    public abstract void use(String s);

    /**
     *  用于复制实例的方法
     */
    public abstract Product createClone();
}
