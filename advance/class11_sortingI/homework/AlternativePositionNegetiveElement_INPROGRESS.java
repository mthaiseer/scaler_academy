package advance.class11_sortingI.homework;

import java.util.Arrays;

public class AlternativePositionNegetiveElement_INPROGRESS {


    void swap(int A[], int i, int j){
        int temp = A[i];
        A[i]  = A[j];
        A[j] = temp;
    }

    public int[] solve(int[] A) {

       // Arrays.sort(A);

        int firstPostivePos = 0;
        for(int x: A){

            if(x>=0){
                break;
            }
            firstPostivePos++;
        }

//        int start =0;
//        int end = firstPostivePos-1;
//        while(start < end){
//
//            swap(A, start, end);
//            start++;
//            end--;
//
//        }



        for(int i=0; i<A.length; i++){

            //if odd position element
            if(i % 2 ==0 && !(A[i] < 0)){
                rightShift(A, i, firstPostivePos);
                firstPostivePos++;
                continue;


            }

            //if odd position element not negative
            if(i % 2 !=0 && !(A[i] >= 0)){
                rightShift(A, i, firstPostivePos);
                firstPostivePos++;
                continue;
            }

        }
        return A;
    }

    void rightShift(int A[], int i, int j){

        int temp  = A[j];
        for(int k=j-1; k>=i; k--){
            A[k+1] = A[k];
        }
        A[i] = temp;


    }

    public static void main(String[] args) {
//        Arrays.stream(new AlternativePositionNegetiveElement().solve(new int[] {-1, -2, -3, 4, 5})).forEach(it->{
//            System.out.print(it + " ");
//        });

        System.out.println();
        Arrays.stream(new AlternativePositionNegetiveElement_INPROGRESS().solve(new int[] {5, -17, -100, -11})).forEach(it->{
            System.out.print(it + " ");
        });

//        int A[] = {1,2,3};
//         new AlternativePositionNegetiveElement().rightShift(A, 0, 1);
//         Arrays.stream(A).forEach(it-> System.out.print(it+ " "));

    }

}
