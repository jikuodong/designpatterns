package templatemethod;

/**
 * describe CharDisplay是AbstractDisplay的子类
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName CharDisplay.java
 * @createTime 2019年07月09日 15:07:00
 */
public class CharDisplay extends AbstractDisplay{
    private char ch;                        // 需要显示的字符
    public CharDisplay(char ch) {          // 构造函数中接收的字符被
        this.ch = ch;                      // 保存在字段中
    }

    @Override
    public void open() {                   // open在父类中是抽象方法
                                          // 此处重写该方法
        System.out.print("<<");         // 显示开始字符“<<”
    }

    @Override
    public void print() {                 // 同样地，此处重写print方法
                                          // 该方法会在dispaly中被重复调用
        System.out.print(ch);           // 显示保存在字段ch中字符
    }

    @Override
    public void close() {                 // 同样地，此处重写close方法
        System.out.println(">>");         // 显示结束字符">>"

    }
}
