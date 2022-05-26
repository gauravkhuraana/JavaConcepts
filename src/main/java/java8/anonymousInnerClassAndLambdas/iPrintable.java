package java8.anonymousInnerClassAndLambdas;

// Writing this annotation which comes from java 8 helps us
// to have just one method as unimplemented or abstract and we can use lambda easily
@FunctionalInterface
public interface iPrintable {

    public abstract void print();

    // For using lambda , interface should be a functional interface
    // that means it should have only one unimplemented method

    //public abstract void anothePrint();

    // Default and static methods have no limitations

    default void print1()
    {
        System.out.println("i am a default method in functional interface");
    }
    static void print2()
    {
        System.out.println("Even i am allowed as i am static");
    }

}
