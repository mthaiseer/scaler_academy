package intermediate.class12_Problemsolving01.practice;

public class MountainHeights {

    /**
     * TIME : O(N^2)
     * SPACE : O(1)
     * @param A
     */
    void findPeakMountainHeights_Bruteforce(int A[]) {

        if (A == null) return;
        int N = A.length;


        for (int i = 0; i < N; i++) {

            int leftMax =0;
            int rightMax =0;

            for (int j = i-1; j >= 0; j--) {
                leftMax = Math.max(leftMax, A[j]);
            }
            for (int j = i+1; j < N; j++) {
                rightMax = Math.max(rightMax, A[j]);
            }
            System.out.println(leftMax  + ", "+ rightMax+ " ");


        }
    }

    /**
     * TIME : O(N)
     * SPACE :O(N)
     * @param A
     */
    void findPeakMountainHeightsOptimal(int A[]) {

        //build prefixMax
        int [] prefixMax = new int[A.length];
        prefixMax[0] =0;
        for(int i=1; i<A.length; i++){
            prefixMax[i] = A[i-1] > prefixMax[i-1]? A[i-1]: prefixMax[i-1];
        }

        //build suffixMax
        int [] suffixMax = new int[A.length];
        suffixMax[A.length-1] = 0;
        for(int i=A.length-2; i>=0; i--){
            suffixMax[i] = suffixMax[i+1] > A[i+1] ? suffixMax[i+1]: A[i+1];
        }

        for(int i=0; i<A.length; i++){
            System.out.println(prefixMax[i] + ","+ suffixMax[i]);
        }

    }

    public static void main(String[] args) {
        MountainHeights obj = new MountainHeights();
        obj.findPeakMountainHeights_Bruteforce(new int[]{3,4,7,2,4,9,10, 1,4});
        System.out.println("*********************");
        obj.findPeakMountainHeightsOptimal(new int[]{3,4,7,2,4,9,10, 1,4});
    }


}
