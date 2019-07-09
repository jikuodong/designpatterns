package adapter.exercise2;

import java.io.IOException;

/**
 * describe
 *
 * @author JKD
 * @version 1.0.0
 * @ClassName Main.java
 * @createTime 2019年07月09日 10:50:00
 */
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();

        try {
            f.readFromFile("file.txt");
            System.out.println(f.getValue("year"));
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
