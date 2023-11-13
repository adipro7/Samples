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

    /*
     * Input and Auxiliary space example

#1

// function to return sum of elements in an array of size n

int sum(int arr[])

{

int sum = 0; // initialize sum

// Iterate through all elements and add them to sum

for (int i = 0; i < n; i++)

sum += arr[i];

return sum;

}

Input and Auxiliary space example cont.

// Driver code

int main()

{

int arr[] = { 12, 3, 4, 15 };

int n = arr.length;

for(int i=0;i<n;i++)
cout << "Sum of given array is " << sum(arr, n);

return 0;

}

Input and Auxiliary space example cont.

Input space is n* c(constant integer space)

Total space complexity is n*c + 2

Auxiliary space is n*c + 2 - n*c = 2 = O(1) -> O(k) where k is constant



     */

     /*
      * class Bank {

public String name;

public int getRateOfInterest() { return 0; }

}

class SBI extends Bank {

public SBI() { name = "SBI";

}

public int getRateOfInterest() { return 8; }

}

class ICICI extends Bank {

public ICICI() name = "ICICI";

}

public int getRateOfInterest() { return 7; }

}

Method overriding cont.

public class Main {

public static void printInterest(Bank b) {

System.out.printf("%s Rate of Interest: %d\n", b.name, b.getRateOfInterest());

}

public static void main(String[] args) {

Bank s = new SBI();

Bank i = new ICICI();

printInterest(s);

printInterest(i);

}

}



      */
}
