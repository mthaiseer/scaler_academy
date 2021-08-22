package advance.class12_sortingII.homework;

import java.util.Arrays;

public class UniqueElements {

    public int solve(int[] A) {

        int ans =0;
        Arrays.sort(A);

        for(int i=1; i<A.length; i++){

            if(A[i-1] == A[i]){
                ans+=1;
                A[i]+=1;
            }

            if(A[i-1]> A[i]){

                int n  = (A[i-1]+1) - A[i];
                ans+=n;
                A[i] +=n;

            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int A[] =  {2, 2,3, 3, 5};
        System.out.println(new UniqueElements().solve(A));
        Arrays.stream(A).forEach(it->{
            System.out.print(it+  " ");
        });
    }

}
