package intermediate.class02_NumberBitManipulation.temp;

public class GFG {
     
    // Function which counts set bits from 0 to n
    static int countSetBits(int n)
    {
        int i = 0;
 
        // ans store sum of set bits from 0 to n
        int ans = 0;
 
        // while n greater than equal to 2^i
        while ((1 << i) <= n) {
 
            // This k will get flipped after
            // 2^i iterations
            boolean k = false;
 
            // change is iterator from 2^i to 1
            int change = 1 << i;
 
            // This will loop from 0 to n for
            // every bit position
            for (int j = 0; j <= n; j++) {
 
                if (k == true)
                    ans += 1;
                else
                    ans += 0;
 
                if (change == 1) {
                     
                    // When change = 1 flip the bit
                    k = !k;
                     
                    // again set change to 2^i
                    change = 1 << i;
                }
                else {
                    change--;
                }
            }
 
            // increment the position
            i++;
        }
 
        return ans;
    }
 
    // Driver program
    public static void main(String[] args)
    {
        int n = 3;
         
        System.out.println(countSetBits(n));
    }
}