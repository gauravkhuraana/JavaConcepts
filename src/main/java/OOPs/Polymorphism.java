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
    public static void main(String[] args) {
        poly1 pl= new poly1();
        pl.runtime();
    }
}

