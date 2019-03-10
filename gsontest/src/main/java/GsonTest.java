import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class GsonTest {

    public static void main(String[] args) throws Exception {

        double c = 0;
        System.out.println("starting");
        for (double i=0; i<1000000000; i++) c++;

        System.out.println(c);

        byte testByte = 126;
        int firstCalc = (testByte + 1);
        System.out.println(firstCalc);
        testByte = (byte) firstCalc;
        System.out.println(testByte);
        short shortNumber = (short) firstCalc;
        System.out.println(shortNumber);




/*        String path = "c:\\Users\\richa\\ingest.json";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(bufferedReader, JsonObject.class);
        JsonArray jsonElements = jsonObject.get("users").getAsJsonArray();
        System.out.println("User: " + jsonElements.get(1).getAsString());*/

    }

}
