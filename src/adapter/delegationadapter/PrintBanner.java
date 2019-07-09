package adapter.delegationadapter;

/**
 * describe 适配器（使用委托的示例程序）
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName PrintBanner.java
 * @createTime 2019年07月09日 10:11:00
 */
public class PrintBanner extends Print{
    private Banner banner;

    public PrintBanner(String string) {
       this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
