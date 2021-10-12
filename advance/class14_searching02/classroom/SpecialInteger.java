package advance.class14_searching02.classroom;

public class SpecialInteger {

    public int solve(int[] A, int B) {

        //declare start and end pointers
        int start =0;
        int end  =0;
        //declare sum to check total sum <=B
        long  sum =0;
        int MOD = 1000000007;
        int N = A.length;
        int ans = Integer.MIN_VALUE;


        while(end < N ){

            sum =  (sum+A[end]);


            if(sum <= B){
                ans =  Math.max(ans, (end - start)+1);

            }else{

                while(sum > B){
                    sum-= A[start];
                    start++;
                    //ans  =  Math.min(ans, (end - start)+1);
                    ans  =  Math.max(ans, (end - start)+1);
                }


            }

            end++;
        }

        return ans;
    }

    public static void main(String[] args) {
//        int A[]  = {1,2,3,4,5};
//        int B = 10;

//        int A[]  = {5, 17, 100, 11};
//        int B = 130;

        int A[]  = {2, 24, 38, 25, 35, 33, 43, 12, 49, 35, 45, 47, 5, 33};
        int B = 249;

        System.out.println(new SpecialInteger().solve(A, B));
    }

}
