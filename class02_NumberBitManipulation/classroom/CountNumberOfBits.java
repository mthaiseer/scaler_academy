package class02_NumberBitManipulation.classroom;

public class CountNumberOfBits {

    static  int numSetBits(int A){

        int count =0;
        while(A >0){
             count += A &1;
             A >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numSetBits(11));
    }
}
