package advance.class14_searching02.classroom;

public class SquarerootOfNumber {

    public int sqrt(int A) {

        if(A == 0){
            return 0;
        }

        int ans =1;
        int start =0;
        int end = A;

        while(start<=end){

            int mid = start + (end-start)/2;
            if(mid>  0 && mid  <= A/mid){

                ans = mid;
                start = mid+1;

            }else{
                end =  mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new SquarerootOfNumber().sqrt(11));
        System.out.println(new SquarerootOfNumber().sqrt(9));
       System.out.println(new SquarerootOfNumber().sqrt(25));
        System.out.println(new SquarerootOfNumber().sqrt(2147483647));
    }

}
