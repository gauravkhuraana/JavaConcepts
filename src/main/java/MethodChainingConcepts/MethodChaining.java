package MethodChainingConcepts;

public class MethodChaining {

    public MethodChaining M1()
    {
        System.out.println("M1");
        return this;
    }
    public MethodChaining M2(String str) {
        System.out.println("Pass string is "+ str);
        return this;
    }

    public MethodChaining M3()
    {
        System.out.println("M3");
        return this;
    }
    public static void main(String[] args)
    {
        MethodChaining obj = new MethodChaining();

        // Since all methods return an object we can write like below
        obj.M1().M2("Jai Shri Krishna").M3();

    }

}
