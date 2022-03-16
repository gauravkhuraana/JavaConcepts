package json;

import org.json.*;

public class jsonParsing {

    public static void main(String[] args)
    {

        String str= "[{\"DataType\": \"Spectre_DT\",  \"HostName\": \"spectrum\",  \"Listener\": \"c\",  \"Timestamp\": \"2016-12-8T13:54:12+08:00\",  \"Duration\": \"0.000086712\" }, {  \"DataType\": \"Spectre_DT\",  \"HostName\": \"spectrum\",  \"Listener\": \"3\",  \"Timestamp\": \"2016-12-8T13:54:12+08:00\",  \"Duration\": \"0.0\" }, {  \"DataType\": \"Spectre_DT\",  \"HostName\": \"spectrum\",  \"Listener\": \"a\",  \"Timestamp\": \"2016-12-8T13:54:11+08:00\",  \"Duration\": \"0.000100080\" }, {  \"DataType\": \"Spectre_DT\",  \"HostName\": \"spectrum\",  \"Listener\": \"5\",  \"Timestamp\": \"2016-12-8T13:54:10+08:00\",  \"Duration\": \"0.0\" }]";

        //JSONObject obj = new JSONObject(str);
        JSONArray jarray = new JSONArray(str);

         for(int i=0;i<jarray.length();i++)
         {
             System.out.println(jarray.get(i));
         }
    }

}
