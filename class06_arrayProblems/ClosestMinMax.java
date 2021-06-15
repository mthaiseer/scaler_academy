package class06_arrayProblems;

import java.util.Arrays;

public class ClosestMinMax {

    public int solveWithSpace(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int resultMax =Integer.MAX_VALUE;

        int leftMaxArr[] = new int[A.length];
        int rightMaxArr[] = new int[A.length];

        for(int i=0; i<A.length; i++){
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }

        int leftCurrentMax = 0;
        Arrays.fill(leftMaxArr, -1);
        for(int i=0; i<A.length; i++){
            if(A[i] == max){
                leftMaxArr[i] = i;
            }else{
                if(i >0 ){
                    leftMaxArr[i] =  leftMaxArr[i-1];
                }
            }
        }


        int rightCurrentMax = 0;
        Arrays.fill(rightMaxArr, -1);
        for(int i=A.length-1; i>=0; i--){
            if(A[i] == max){
                rightMaxArr[i] = i;
            }else{
                if(i < A.length-1){
                    rightMaxArr[i] = rightMaxArr[i+1];
                }
            }
        }

        for(int i=0; i<A.length; i++){
            if(A[i] == min){

                int l = leftMaxArr[i] == -1 ? Integer.MAX_VALUE : Math.abs(i- leftMaxArr[i]);
                int r = rightMaxArr[i] == -1 ? Integer.MAX_VALUE : Math.abs(rightMaxArr[i] - i);
                resultMax = Math.min(resultMax, Math.min(l, r)+1);
            }


        }
        return resultMax;
    }

    public static void main(String[] args) {
      ClosestMinMax obj = new ClosestMinMax();
        int solution  =  obj.solveWithSpace(new int [] {1,2,3,2,2,1,2,2,3});
        System.out.println("solution "+ solution);

        solution  =  obj.solveWithSpace(new int [] {1,2,2,2,3,2,1});
        System.out.println("solution "+solution);

         solution  =  obj.solveWithSpace(new int [] {1,2,2,2,2,3,2,1});
        System.out.println("solution "+solution);


    }

}
