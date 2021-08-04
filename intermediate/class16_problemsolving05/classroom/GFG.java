package intermediate.class16_problemsolving05.classroom;

import java.util.Arrays;
import java.util.Vector;

public class GFG {
    // Function to find sum of bitwise OR
    // of all subarrays
    static int givesum(int A[], int n)
    {

        // Find max element of the array
        int max = Arrays.stream(A).max().getAsInt();

        // Find the max bit position
        // set in the array
        int maxBit = (int)Math.ceil(Math.log(max) + 1);
        int totalSubarrays = n * (n + 1) / 2;

        int s = 0;

        // Traverse from 1st bit to last bit which
        // can be set in any element of the array
        for (int i = 0; i < maxBit; i++) {
            int c1 = 0;

            // Vector to store indexes of the array
            // with i-th bit not set
            Vector<Integer> vec = new Vector<>();

            int sum = 0;

            // Traverse the array
            for (int j = 0; j < n; j++) {

                // Check if ith bit is not set in A[j]
                int a = A[j] >> i;
                if (!(a % 2 == 1)) {
                    vec.add(j);
                }
            }

            System.out.println(vec);

            // Variable to store count of subarrays
            // whose bitwise OR will have i-th bit
            // not set
            int cntSubarrNotSet = 0;

            int cnt = 1;

            for (int j = 1; j < vec.size(); j++) {
                if (vec.get(j) - vec.get(j - 1) == 1) {
                    cnt++;
                }
                else {
                    cntSubarrNotSet += cnt * (cnt + 1) / 2;

                    cnt = 1;
                }
            }

            // For last element of vec
            cntSubarrNotSet += cnt * (cnt + 1) / 2;

            // If vec is empty then cntSubarrNotSet
            // should be 0 and not 1
            if (vec.size() == 0)
                cntSubarrNotSet = 0;

            // Variable to store count of subarrays
            // whose bitwise OR will have i-th bit set
            int cntSubarrIthSet = totalSubarrays - cntSubarrNotSet;

            s += cntSubarrIthSet * Math.pow(2, i);
        }
        return s;
    }

    // Driver code
    public static void main(String[] args)
    {
        int A[] = { 7, 8, 9, 10 };
        int n = A.length;
        System.out.println(givesum(A, n));
    }
}
