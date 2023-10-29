import org.testng.annotations.Test;

import java.util.Scanner;

public class test {
        @Test
    public void test(){
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        scanner.close();
        System.out.println(string);
        string = scanner.next();
        System.out.println(string);
        string = scanner.next();
        System.out.println(string);



    }
}
