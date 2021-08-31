package javaFakerAPI;

import com.github.javafaker.Faker;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class faker_letterify_numerify_bothify {


    Faker fk;

    @BeforeSuite
    public void faker()
    {
        fk=new Faker();
    }

    @Test
    // ? for letters and # for number
    public void letterify()
    {
        System.out.println(fk.letterify("ABC?FGFG#?"));
        System.out.println(fk.letterify("ABC?FGFG#??",true));
    }

    @Test
    // ? for letters and # for number
    public void numerify()
    {
        System.out.println(fk.numerify("1234234abcsfdf_###_fdsfas###_34"));
    }

    @Test
    // ? for letters and # for number
    public void bothify()
    {
        System.out.println(fk.bothify("535ggsg1535###fgdg.@#####@3.???"));
    }

    @Test
    public void bothifyCapital()
    {
        System.out.println(fk.bothify("2434345###4234gdsggf___???___",true));
    }

}
