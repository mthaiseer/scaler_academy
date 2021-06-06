package class04_array_dynamicarrays.homework;

public class MultiplicationPreviousNext {

    public static  int[] solve(int[] A) {

        int left = 1;
        int right = 1;
        int result[] = new int[A.length];

        for(int i=0; i<A.length; i++){

            if(i-1 <0){
                left =A[i];
            }else{
                left = A[i-1];
            }

            if(i+1 > A.length-1){
                right = A[i];
            }else{
                right = A[i+1];
            }

            result[i] = left*right;


        }


        return result;
    }

    public static void main(String[] args) {

        int R[] = solve(new int[]{1,2,3,4,5});
        for(int x: R){
            System.out.print(x + " ");
        }

        System.out.println();

        int R1[] = solve(new int[] {5, 17, 100, 11});
        //85, 500, 187, 1100
        for(int x: R1){
            System.out.print(x + " ");
        }

        System.out.println();

        int R2[] = solve(new int[] {0,0,0,0,0});
        for(int x: R2){
            System.out.print(x + " ");
        }

        System.out.println();

        int R3[] = solve(new int[] {1,1,1,1,2});
        for(int x: R3){
            System.out.print(x + " ");
        }

        System.out.println();
        int R4[] = solve(new int[] {-100, 1});
        for(int x: R4){
            System.out.print(x + " ");
        }

    }
}
