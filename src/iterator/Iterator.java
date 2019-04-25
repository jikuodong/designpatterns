package iterator;

/**
 * describe 遍历集合的接口
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Iterator.java
 * @createTime 2019年04月25日 15:26:00
 */
public interface Iterator {
    /**
     * describe  判断是否存在下一个元素的hasNext方法
     *
     * @method hasNext
     * @author JKD
     * @return boolean
     * @data 2019/4/25 15:29
     */
    public abstract boolean hasNext();

    /**
     * describe 获取下一个元素
     *
     * @method next
     * @author JKD
     * @return java.lang.Object
     * @data 2019/4/25 15:30
     */
    public abstract Object next();
}
