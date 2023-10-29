package DataStructures;

import org.junit.Test;

import java.util.HashMap;

public class hashMapExamples {


    @Test
    public void test() {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("test","value");

        System.out.println(hashMap.get("test"));
    }
}
