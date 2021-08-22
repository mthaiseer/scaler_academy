package advance.class13_searching01.homework;

public class SpecialInteger {


    public int solveV2( int[] A , int B) {

        long sum=0;
        int left=0;

        int ans=A.length;

        for(int i=0;i<A.length;i++){
            sum+=A[i];

            while(sum>B){
                ans=Math.min(ans,i-left);

                sum-=A[left];
                left++;
            }
        }
        return (ans!=A.length+1) ? ans : 1;

    }


    public static void main(String[] args) {
        System.out.println(new SpecialInteger().solveV2(new int[]{5, 17, 100, 11}, 130));
        System.out.println(new SpecialInteger().solveV2(new int[]{1, 1000000000}, 1000000000));
    }

}
