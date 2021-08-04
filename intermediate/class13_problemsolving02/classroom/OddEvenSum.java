package intermediate.class13_problemsolving02.classroom;

public class OddEvenSum {

    public int solve(int[] A) {

        int oddPrefixSum[] = new int[A.length+1];
        int evenPrefixSum[] = new int[A.length+1];

        int globalResult = 0;

        //build odd even prefix
        for(int i=1; i<=A.length; i++){
         if((i-1)%2 == 0){
                evenPrefixSum[i] += A[i-1]+ evenPrefixSum[i-1];
          }else{
                evenPrefixSum[i] +=evenPrefixSum[i-1];
            }
        }

        for(int i=1; i<=A.length; i++){
            if((i-1)%2 != 0){
                oddPrefixSum[i] += A[i-1]+ oddPrefixSum[i-1];
            }else{
                oddPrefixSum[i] +=oddPrefixSum[i-1];
            }
        }

        for(int i=1; i<oddPrefixSum.length; i++){

            int evenSum  =  evenPrefixSum[i-1]+ (oddPrefixSum[oddPrefixSum.length-1] - oddPrefixSum[i]);
            int oddSum  =   oddPrefixSum[i-1]+ (evenPrefixSum[oddPrefixSum.length-1] - evenPrefixSum[i]);

            if(evenSum == oddSum){
                globalResult+=1;
            }



        }




        return globalResult;

    }

    public static void main(String[] args) {
        OddEvenSum obj = new OddEvenSum();
        System.out.println(obj.solve(new int[]{2,1,6,4}));
        System.out.println(obj.solve(new int[]{2, 1, 6, 4}));
        System.out.println(obj.solve(new int[]{1,1,1}));
    }


}
