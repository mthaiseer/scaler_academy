package intermediate.class02_NumberBitManipulation.classroom;

public class SingleNumber {

    public static  int singleNumber(final int[] A) {
        int result =0;
        for(int i=0; i<A.length; i++){
            result = result ^ A[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1, 2, 2, 3, 1}));
        System.out.println(singleNumber(new int[]{1, 2, 2}));

    }
}
