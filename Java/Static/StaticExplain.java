package Static;

public class StaticExplain {
    private static int countObjects = 0;
    private int count = 0;
    // public StaticExplain() {
    //     this.countObjects = 0;
    //     this.count = 0;
    // }
    public void operate() {
        System.out.println("Count Objects=" + countObjects++);
        System.out.println("Count=" + count++);
    }
    public static void getCountObjects(int id) {
        System.out.println("GET COUNT OBJECTS "+ id + "=" + countObjects++);
    }
    public void getCount(int id) {
        System.out.println("GET COUNT "+ id + "=" + count++);
    }
}
