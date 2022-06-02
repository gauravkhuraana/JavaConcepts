package java8.Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ArrayList {

    public static void main(String[] args) {
        List<String> al = Arrays.asList("HAre Krishna","hari bol","Jai shri Krishna");

        // printing
        for(int i=0;i<al.size();i++)
            System.out.println(al.get(i));

        // printing for each way
        for (String temp:al) {
            System.out.println(temp);
        }

        // Trying the java 8 way
        System.out.println("Java 8 way");
        Consumer<String > con = (s) -> System.out.println(s);
        Consumer<String > con1 = (s) -> System.out.println(s.toUpperCase());
        al.forEach(con);
        System.out.println("Passing a different implementation to the consumer");
        al.forEach(con1);

        System.out.println("Do both things in one go using andThen function and this is done on each element one bye one");
        al.forEach(con.andThen(con1));

        System.out.println("Java 8 advanced way");
        // java 8 advanced way
        al.forEach(s-> System.out.println(s));
    }
}
