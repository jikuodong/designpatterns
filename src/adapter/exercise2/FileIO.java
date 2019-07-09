package adapter.exercise2;

import java.io.IOException;

/**
 * describe FileIO 接口相当于所需要的直流12伏特电源
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName FileIO.java
 * @createTime 2019年07月09日 10:44:00
 */
public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);
}
