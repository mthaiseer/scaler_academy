package intermediate.class04_array_dynamicarrays.classroom;

public class OddEvenSubsequence {

    public static  int solve(int[] A) {

        if(A == null || A.length == 0){
            return 0;
        }
        boolean even = false;
        int counter  =1;

        even = A[0] %2 == 0? true: false;

        for(int i=1; i<A.length; i++){

            if(A[i] % 2 == 0 && !even){
                even = !even;
                counter++;
            }

            if(A[i] % 2 != 0 && even){
                even = !even;
                counter++;
            }

        }
        return counter;
     }

    public static void main(String[] args) {
        System.out.println(solve(new int[] {1, 2, 2, 5, 6}));
        System.out.println(solve(new int[] {5, 10, 5, 2, 1, 4}));
    }

}
