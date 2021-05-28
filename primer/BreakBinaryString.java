package primer;

public class BreakBinaryString {

    public static int solve(String A) {

        if(A == null ){
            return -1;
        }

        int zeroCounter =0;
        int oneCounter =0;
        int  result  = 0;

        for(int i=0; i<A.length(); i++){

            char s = A.charAt(i);
            if(s ==  '0'){
                zeroCounter++;
            }

            if(s== '1'){
                oneCounter++;
            }

            if(zeroCounter == oneCounter){
                result++;
            }

        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(solve("101100"));
        System.out.println(solve("00011011"));
        System.out.println(solve("01"));
        System.out.println(solve("000"));
        System.out.println(solve("111"));

    }
}
