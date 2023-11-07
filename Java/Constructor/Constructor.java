package Constructor;

public class Constructor {
    int num;
    public Constructor(int n) {
        num = n;
    }
}
class oppsjava {
    public static void main(String[] args) {
        opps p1 = new opps("ab",2004);
        System.out.println(p1.name);
        
        System.out.println(p1.calculateAge(2023));
    }
}

public class opps {
     int birthyear;
     String name;
    
    public opps(String name, int birthyear){
        this.name = name;
        this.birthyear = birthyear;
    }
    public int calculateAge(int currentyear){
        return currentyear - this.birthyear;
    }

}