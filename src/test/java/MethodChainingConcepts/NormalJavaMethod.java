package MethodChainingConcepts;

import org.testng.annotations.Test;

public class NormalJavaMethod {

    public void M1()
    {
        System.out.println("M1");
    }
    public void M2(String str) {
        System.out.println("Pass string is "+ str);
    }

    public void M3()
    {
        System.out.println("M3");
    }

    @Test
    public void Test()
    {
        NormalJavaMethod obj = new NormalJavaMethod();
        obj.M1();;
        obj.M2("Udzial Means Share");
        obj.M3();

    }

}
