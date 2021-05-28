package primer;

public class PonyAndMobilePhones {

    static int [] maxMobilesValues;

    static int findMaxMobilesCanBuy(int currentMobilePrice){

        int start =0;
        int end = maxMobilesValues.length-1;
        int possibleAnswer = -1;

        while(start <= end){

            int mid  = (start+end)/2;
            if(currentMobilePrice == maxMobilesValues[mid]){
                return mid;
            }

            if(currentMobilePrice < maxMobilesValues[mid]){
                end = mid-1;
            }
            if(currentMobilePrice > maxMobilesValues[mid]){
                possibleAnswer = mid;
                start = mid+1;
            }

        }
        return  possibleAnswer;

    }

    public static int[] solve(int[] A, int[] B) {

        maxMobilesValues = new int[A.length];
        maxMobilesValues[0] = A[0];
        int ans[] = new int[B.length];

        for(int i=1; i<A.length; i++){
            maxMobilesValues[i] = maxMobilesValues[i-1]+ A[i];
        }

        for(int i=0; i<B.length; i++){
            int result = findMaxMobilesCanBuy(B[i]);
            if(result == -1){
                ans[i] = 0;
            }else{
                ans[i] = result+1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
//        int A[] = {3, 4, 4, 6};
//        int B[] = {20, 4, 10, 2};

        int A[] = {3, 4, 4, 6};
        int B[] = {20, 10, 28, 26};

        int result[] = solve(A, B);
        for(int a: result){
            System.out.print( a + " ");
        }
    }


}
