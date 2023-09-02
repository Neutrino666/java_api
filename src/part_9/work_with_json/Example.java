package part_9.work_with_json;

import com.google.gson.Gson;

public class Example {

    public static void main(String[] args) {
        // Сериализация
        TestClass testClass = new TestClass(1, 2, "test");
        Gson gson = new Gson();
        System.out.println(gson.toJson(testClass));
        String stringJson = gson.toJson(testClass);

        TestClass testClass1 = new TestClass(1, 2, "test", new int[] {1, 2, 3, 4});
        System.out.println(gson.toJson(testClass1));

        TestClass testClass2 = new TestClass(
                1,
                2,
                "test",
                new int[] {1, 3, 4},
                new AnotherClass(1, 2));
        System.out.println(gson.toJson(testClass2));

        // Десериализация
        TestClass testClass3 = gson.fromJson(stringJson, TestClass.class);
        System.out.println(testClass3.field3);


    }
}
