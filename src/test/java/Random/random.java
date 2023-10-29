package Random;

import org.testng.annotations.Test;

import java.util.Random;

public class random {

    @Test
    public void randomNumbers()
    {
        Random rand = new Random();
        // YOU CANNOT PASS 0 HERE , it will throw exception
        System.out.println("Random number is "+ rand.nextInt(1));
    }
}
