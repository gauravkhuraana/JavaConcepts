package javaFakerAPI;

import com.github.javafaker.Faker;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class fakerAPIRandom {

    Faker fk;
    @BeforeSuite
    public void beforesuite()
    {
        fk = new Faker();
    }
    @Test
    public void generateRandomNumbers()
    {

        // Single Digit 0-9
        System.out.println(fk.number().digit());
        System.out.println(fk.number().randomDigit());

        // Single digit except 0
        System.out.println(fk.number().randomDigitNotZero());

        // Digits with length defined
        System.out.println(fk.number().digits(3));
        System.out.println(fk.number().digits(5));
    }
    @Test
    public void range()
    {
        // 1 is inclusive and 999 is exclusive
        System.out.println(fk.number().numberBetween(1,999));

        // number of 4 decimal places with min and max
        System.out.println(fk.number().randomDouble(4,10,100));
    }


}
