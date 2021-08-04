package advance.class05_primefactors;

public class NumberOfDivisors {


    public int[] solve(int[] A) {

        int result[] = new int[A.length];

        for(int i=0; i<A.length; i++){
            result[i] = countDivisors(A[i]);
        }
        return result;
    }

    int countDivisors(int N){

        int count  =0;

        for(int i=1; i*i<=N; i++){

           if(N % i == 0){
               count++;

               if(N/i != i){
                   count++;
               }
           }



        }

        return count;

    }

    public static void main(String[] args) {


        NumberOfDivisors obj = new NumberOfDivisors();


       int A[] = obj.solve(new int[] {2, 3, 4, 5});
       for(int x: A){
           System.out.print( x + " ");
       }

        System.out.println();

        int A2[] = obj.solve(new int[] {8, 9, 10});
        for(int x: A2){
            System.out.print( x + " ");
        }
    }
}
