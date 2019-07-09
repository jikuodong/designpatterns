package adapter.extendsAdapter;

/**
 * describe 适配器
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName PrintBanner.java
 * @createTime 2019年04月26日 13:36:00
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner (String string) {
        super(string);
    }
    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
