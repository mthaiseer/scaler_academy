package advance.class12_sortingII.classroom;

import java.util.Arrays;

public class AlternativeNegetiveElement {

    public int[] solve(int[] A) {


        //TODO -ve at even and +ve at odd
        for(int i=0;  i<A.length; i++){

            int idx = -1;

            if(i % 2 == 0 && A[i] >= 0){
                for(int j =i; j<A.length; j++){
                    if(A[j] < 0){
                        idx = j;
                        break;
                    }
                }
                if(idx!= -1){
                    rotate(A, i, idx);
                }


            }

            if(i % 2 != 0 && A[i] <  0){


                for(int j =i; j<A.length; j++){
                    if(A[j] >= 0){
                        idx = j;
                        break;
                    }
                }
                if(idx!= -1){
                    rotate(A, i, idx);
                }
            }




        }
        return A;
    }

    private void rotate(int[] A, int start, int end) {

        int temp = A[end];
        for(int j = end-1; j>=start; j--){
            A[j+1] = A[j];
        }

        A[start] = temp;


    }

    public static void main(String[] args) {
        //int A[] = new int[]{1, 3, -3};
        int A[] = new int[]{-1, 0, 8};

       // new AlternativeNegetiveElement().solve(A);
       //int A[] = new int[]{-1, -2, -3, 4, 5,8,9,9,9};
       new AlternativeNegetiveElement().solve(A);


        Arrays.stream(A).forEach(it -> {
            System.out.print(it+ " ");
        });



    }



}
