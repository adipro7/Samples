package Patterns;

public class Pattern {
    /*
     *      1
     *     2 3 2
     *   3 4 5 4 3
     * 4 5 6 7 6 5 4
     * ... n rows
     */
    private int n;
    public Pattern(int n) {
        this.n = n;
    }

    public void printPattern() {
        // int i=1, 2*+1 -> 2*(row-1) + 1 -> max num
        // min -> row 
        // for every row -> row se 2*(row-1) + 1
        int t = n;
        for(int i = 1; i<=n;i++) {
            for(int j=1; j<=t-1;j++) {
                System.out.print("  ");
            }
            for(int j=i; j<=2*(i-1)+1; j++) {
                System.out.print(j + " ");
            }
            for(int j=2*(i-1); j>=i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            t--;
        }
        /*
         * 1           
         * 2 3       
         * 3 4 5  
         * 4 5 6 7
         * 5 6 7
         * 6 7
         * 7
         */
    } 
}
