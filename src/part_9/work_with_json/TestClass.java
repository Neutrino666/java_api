package part_9.work_with_json;

public class TestClass {
     int field1;
     int field2;
     String field3;
     int[] field4;

     AnotherClass anotherClass;

    public TestClass(int field1, int field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public TestClass(int field1, int field2, String field3, int[] field4) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
    }

    public TestClass(int field1, int field2, String field3, int[] field4, AnotherClass anotherClass) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
        this.anotherClass = anotherClass;
    }
}
