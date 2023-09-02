package part_9.work_with_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Example1 {

    public static void main(String[] args) {

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder
                .setPrettyPrinting()
                .serializeNulls()
                .create();
        TestClass testClass = new TestClass(1, 2, "str");
        System.out.println(gson.toJson(testClass));
    }
}
