package DataStructures;

import java.util.HashMap;

public class hashMapExamples {


    public static void main(String[] args)
    {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("test","value");

        System.out.println(hashMap.get("test"));
    }
}
