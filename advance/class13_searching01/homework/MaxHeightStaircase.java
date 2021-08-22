package advance.class13_searching01.homework;

public class MaxHeightStaircase {

    public int solve(int A) {

        long count = 0;
        long start =0;
        long end = A;

        while (start<= end){

            long mid = (start+end)/2;
            long  cal = (mid* (mid+1))/2;

            if(cal <= A){
                count = mid;
                start = mid+1;

            }else{
                end = mid-1;
            }

        }
        return (int)count;
    }

    public static void main(String[] args) {
        System.out.println(new MaxHeightStaircase().solve(10));
        System.out.println(new MaxHeightStaircase().solve(17));
        System.out.println(new MaxHeightStaircase().solve(86));
    }


}
