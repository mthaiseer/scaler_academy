package advance.class15_twopointer.classroom;

public class RainwaterTapping {

    public int maxArea(int[] A) {
        int ans =0;
        int N = A.length;
        int i= 0;
        int j = N-1;


        while(i<j){

            ans = Math.max(ans, Math.min(A[i], A[j]) * (j-i));

            if(A[i]< A[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new RainwaterTapping().maxArea(new int[]{1, 5, 4, 3}));
    }


}
