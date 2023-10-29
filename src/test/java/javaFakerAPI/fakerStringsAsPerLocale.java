package javaFakerAPI;

import com.github.javafaker.Faker;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Locale;

public class fakerStringsAsPerLocale {

    Faker fk;

    @BeforeSuite
    public void beforesuite()
    {
        fk = new Faker();
    }
    @Test
    public void withoutLocale()
    {
        // Name Fields
        System.out.println(fk.name().firstName());
        System.out.println(fk.name().lastName());

        // Address Fields
        System.out.println(fk.address().cityName());
        System.out.println(fk.address().state());
        System.out.println(fk.address().country());

        // Phone number
        System.out.println(fk.phoneNumber().cellPhone());
        System.out.println(fk.animal().name());
    }

    @Test
    public void withLocaleConstructor()
    {
        // Name Fields
        fk= new Faker(new Locale("en-IND"));
        System.out.println(fk.name().firstName());
        System.out.println(fk.name().lastName());

        // Address Fields
        System.out.println(fk.address().cityName());
        System.out.println(fk.address().state());
        System.out.println(fk.address().country());

        // Phone number
        System.out.println(fk.phoneNumber().cellPhone());
        System.out.println(fk.phoneNumber().phoneNumber());


        System.out.println(fk.animal().name());
    }
}
