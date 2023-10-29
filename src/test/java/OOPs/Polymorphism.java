package OOPs;

import org.testng.annotations.Test;

class Polymorphism {
    public void runtime() {
        System.out.println("this is run time");
    }
}
class poly1 extends Polymorphism {
    public void runtime() {
        System.out.println("this run time polymorphism");
    }
//
     @Test
    public void test() {
//        poly1 pl= new poly1();
//        pl.runtime();
//    }
     }
    public static void call(String whom)
    {
        System.out.println("Calling "+whom);
    }

    public static void call(int whom)
    {
        System.out.println("Calling "+whom);
    }

    public static void call(String whom, String salutation)
    {
        System.out.println("Calling "+ whom + " " + salutation);
    }
        @Test
    public void test1(){
       call("mummy");
       call("mummy","ji");
       call(10);
    }
}

