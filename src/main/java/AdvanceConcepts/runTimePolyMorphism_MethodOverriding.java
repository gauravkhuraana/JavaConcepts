package AdvanceConcepts;

import  org.testng.annotations.Test;

public class runTimePolyMorphism_MethodOverriding {

    @Test
    public void m1()
    {
        AdvanceConcepts.I1 ref1 = AdvanceConcepts.MethodOveridingClass.someMethod1();
        AdvanceConcepts.I1 ref2 = AdvanceConcepts.MethodOveridingClass.someMethod2();

        ref1.printAnything();
        ref1.printSomething();

        ref2.printAnything();
        ref2.printSomething();
    }
}
