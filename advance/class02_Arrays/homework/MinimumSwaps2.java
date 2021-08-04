package advance.class02_Arrays.homework;

public class MinimumSwaps2 {
    public int solve(int[] A) {
        int swapCount  =0;

        for(int i=0; i<A.length; i++){

            while(i != A[i]){

                swapEl(A, i, A[i]);
                swapCount++;

            }

        }

        return swapCount;


    }
    void swapEl(int A[], int i, int j){

        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;



    }

    public static void main(String[] args) {
        MinimumSwaps2 obj = new MinimumSwaps2();
        System.out.println(obj.solve(new int[]{0,1,4,3,2}));
        System.out.println(obj.solve(new int[]{1, 2, 3, 4, 0}));
        System.out.println(obj.solve(new int[]{2, 0, 1, 3}));
    }

}
