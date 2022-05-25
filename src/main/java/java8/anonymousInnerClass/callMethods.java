package java8.anonymousInnerClass;

public class callMethods {

    public static void main(String[] args) {
        iPrintable obj = new iPrintable() {
            @Override
            public void print() {
                System.out.println("We are giving implmenetation via anonymous class");
            }
        };

        iPrintable obj1 = new iPrintable() {
            @Override
            public void print() {
                System.out.println("We are giving another implmenetation");
            }
        };
        obj1.print();
        obj.print();
    }
}
