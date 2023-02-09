package OOPs;

class Polymorphism {
    public void runtime() {
        System.out.println("this is run time");
    }
}
class poly1 extends Polymorphism {
    public void runtime() {
        System.out.println("this run time polymorphism");
    }
//    public static void main(String[] args) {
//        poly1 pl= new poly1();
//        pl.runtime();
//    }
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
    public static void main(String[] args) {
       call("mummy");
       call("mummy","ji");
       call(10);
    }
}

