package java8.anonymousInnerClassAndLambdas;

public class callMethods {

    public static void main(String[] args) {
        iPrintable obj = new iPrintable() {
            @Override
            public void print() {
                System.out.println("We are giving implmentation via anonymous class");
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

        // Doing the better way using lambda expression

        // If we compare this code with above code its doing the same thing
        // Interface has just one method (print)
        // There are same parameters to pass (0 in current case)
        // return type should also match which is void in our case
        iPrintable obj3 = () -> System.out.println("We are giving another implmenetation");
        obj3.print();


        iOneParamNoReturn iOneParamNoReturn1 = (String s) -> System.out.println(s);
        // one parameter we are passing
        iOneParamNoReturn1.oneParamNoReturn("HareKrishna here we are explicitly listing the parameter type which is not needed");
        iOneParamNoReturn iOneParamNoReturn = s -> System.out.println(s);
        // one parameter we are passing
        iOneParamNoReturn.oneParamNoReturn("HareKrishna");

        iTwoParamNoReturn iTwoParamNoReturn = (a, b) -> {
            String c = a + b;
            System.out.println("Concantenation is " + c);
        };
        iTwoParamNoReturn.twoParamNoReturn("Hare", "Krishna");

        // no need to type even the written keyword as its understood
        iNoParamButReturn iNoParamButReturn = () -> "Hari bol";
        System.out.println("Return is " + iNoParamButReturn.noParamButReturn());

        iOneParamOneReturn iOneParamOneReturn = x -> {
            int y = x + 10;
            String toReturn = "We have accepted one parameter and added 10 in it and it became = " + String.valueOf(y);
            return toReturn;
        };
        System.out.println(iOneParamOneReturn.oneParamOneReturn(5));


        iOneParamOneBooleanReturn iOneParamOneBooleanReturn = x -> x > 10;
        System.out.println(iOneParamOneBooleanReturn.oneParamOneReturn(20));
    }
}
