package Constructor;

public class oops {
     int birthyear;
     String name;
    
    public oops(String name, int birthyear){
        this.name = name;
        this.birthyear = birthyear;
    }
    public int calculateAge(int currentyear){
        return currentyear - this.birthyear;
    }

}
