package ErrorHandling;

import org.junit.Test;

public class allAboutExceptions {

    @Test
    public void produceException()
    {
        int i=0;
        try
        {
            i=10/i;
        }
        catch (Exception e)
        {
            System.out.println(e.getStackTrace());
        }
    }
}
