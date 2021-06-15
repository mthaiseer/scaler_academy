package class06_arrayProblems;

public class LongestConsecutiveOnes {
    public int solve(String A) {

        int[] leftmax = new int[A.length()];
        int[] rightmax = new int[A.length()];

        int ones =0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == '1'){
                ones+=1;
            }
        }

        leftmax[0] =0;
        for(int i=1; i<A.length(); i++){

            if(A.charAt(i-1) ==  '0'){
                leftmax[i] =  0;
            }else{
                leftmax[i] =  leftmax[i-1]+ 1;
            }

        }

        rightmax[rightmax.length-1] =0;

        for(int i=A.length()-2; i>=0; i--){

            if(A.charAt(i+1) ==  '0'){
                rightmax[i] =  0;
            }else{
                rightmax[i] =  rightmax[i+1]+ 1;
            }


        }

        int result = 0;
        for(int i=0; i<A.length(); i++){

            result =  Math.max(result, (leftmax[i]+ rightmax[i]+1 ));

        }

        return result > ones? result-1 : result;
    }

    public static void main(String[] args) {
        LongestConsecutiveOnes obj = new LongestConsecutiveOnes();
        System.out.println(obj.solve("01111110001111011110"));
    }


}
