import Constructor.Constructor;
import Static.StaticExplain;

public class Main {
    public static void main(String ar[]) {
        System.out.println("Hello World");
        //Constructor constructor = new Constructor();
        StaticExplain object1 = new StaticExplain();
        StaticExplain object2 = new StaticExplain();
        // object1.operate();
        // object2.operate();
        // object1.operate();
        // object2.operate();
        object1.getCount(1);
        object1.getCount(1);
        object2.getCount(2);
        object2.getCount(2);
        object1.getCountObjects(1);
        object1.getCountObjects(1);
        object2.getCountObjects(2);
        object2.getCountObjects(2);

        StaticExplain.getCountObjects(0);
        StaticExplain.getCount();
    }
}