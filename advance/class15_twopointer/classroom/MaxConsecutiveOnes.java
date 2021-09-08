package advance.class15_twopointer.classroom;

public class MaxConsecutiveOnes {

    public int[] maxone(int[] A, int B) {

        int i=0;
        int j =0;
        int maxi =0;
        int maxj = 0;
        int zCount = 0;
        int maxWindow = Integer.MIN_VALUE;
        int N =A.length;

        while(j<N){

            zCount+= A[j] == 0?1: 0;

            while(zCount> B){

                zCount-= A[i] == 0?1: 0;
                i++;

            }

            int windowSize = (j-i)+1;

            if(windowSize> maxWindow){
                maxWindow = windowSize;
                maxi =i;
                maxj =j;
            }

            j++;


        }
        int size = (maxj-maxi)+1;
        int res[] = new int[size];

      int l=0;
        for(int k=maxi;k<=maxj; k++ ){
            res[l] = k;
            l++;

        }
         return res;

    }

    public static void main(String[] args) {
        int[] A = new MaxConsecutiveOnes().maxone(new int[]{1,1,0,1,1,0,0,1,1,1}, 1);
        for(int x:A){
            System.out.print(x+ " ");
        }
        System.out.println();
        int B[] =  new MaxConsecutiveOnes().maxone(new int[]{1,1,0,0,1,1,0,0,1,1,1}, 3);
        for(int x:B){
            System.out.print(x+ " ");
        }
        System.out.println();
    }

}
