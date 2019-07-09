package singleton.exercise2;

/**
 * describe  请编写Triple类，实现最多只能生成3个Triple类的实例，实现编号分别为0,1,2,且可以通过getInstance(int id)来获取该编号对应的实例
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Triple.java
 * @createTime 2019年07月03日 14:46:00
 */
public class Triple {
    private  static Triple[] triple = new Triple[] {
            new Triple(0),
            new Triple(1),
            new Triple(2)
    };
    private int id;
    private Triple(int id){
        System.out.println("The instance "+id+ " is created.");
        this.id = id;
    }

    public static  Triple getInstance(int id) {
        return triple[id];
    }

    @Override
    public String toString() {
        return "[Triple id = " + id +"]";
    }
}
