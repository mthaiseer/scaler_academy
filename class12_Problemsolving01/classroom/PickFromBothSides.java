package class12_Problemsolving01.classroom;

public class PickFromBothSides {

    public int solve(int[] A, int B) {

        int N = A.length;

        int prefixSum  [] = new int[B+1];
        int suffixSum  [] = new int[B+1];

        prefixSum[0] =0;
        for(int i=1; i<=B; i++){
            prefixSum[i]=  prefixSum[i-1]+ A[i-1];
        }

        suffixSum[B] =0;
        int bLen = B-1;

        for(int i=N-1; i>= (N-B); i--){
            suffixSum[bLen] = suffixSum[bLen+1]+ A[i];
            bLen--;
        }

        int max =Integer.MIN_VALUE;
        for(int i=0; i<=B; i++){
            max = Math.max( max, suffixSum[i]+ prefixSum[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        PickFromBothSides obj = new PickFromBothSides();
       // System.out.println(obj.solve(new int[]{5, -2, 3 , 1, 2}, 3));
       // System.out.println(obj.solve(new int[]{1, 2, -5}, 2));
        System.out.println(obj.solve(new int[]{ -969, -948, 350, 150, -59, 724, 966, 430, 107, -809, -993, 337, 457, -713, 753, -617, -55, -91, -791, 758, -779, -412, -578, -54, 506, 30, -587, 168, -100, -409, -238, 655, 410, -641, 624, -463, 548, -517, 595, -959, 602, -650, -709, -164, 374, 20, -404, -979, 348, 199, 668, -516, -719, -266, -947, 999, -582, 938, -100, 788, -873, -533, 728, -107, -352, -517, 807, -579, -690, -383, -187, 514, -691, 616, -65, 451, -400, 249, -481, 556, -202, -697, -776, 8, 844, -391, -11, -298, 195, -515, 93, -657, -477, 587 }, 81));
    }
}
