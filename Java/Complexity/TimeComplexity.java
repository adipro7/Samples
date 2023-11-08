package Complexity;

public class TimeComplexity {
    public boolean isPrimeWay1(int n) {
        long startTime = System.currentTimeMillis();
        int count = 0;
        for(int i = 1; i<=n;i++) {
            if(n%i == 0) {
                count++;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by Way 1 = " + (endTime-startTime));
        return count == 2;
    }

    public boolean isPrimeWay2(int n) {
        long startTime = System.currentTimeMillis();
        int count = 0;
        for(int i = 1; i*i<=n;i++) {
            if(n%i == 0) {
                count++;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by Way 2 = " + (endTime-startTime));
        return count == 1;
    }
}
