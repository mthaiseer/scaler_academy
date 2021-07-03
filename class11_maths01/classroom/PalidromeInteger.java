package class11_maths01.classroom;

public class PalidromeInteger {

    public int isPalindrome(int A) {
        if(A  < 0) return  0;

        //take digit count
        int divisor  = 1;
        while(A/divisor >=10){
            divisor*=10;
        }

        while(A != 0){

            //take integers from both the ends
            int left = A/divisor;
            int right = A % 10;

            if(left != right){
                return 0;
            }

            //remove left and right from both ends
            A = (A%divisor)/10;

            //both ends are removed for reduce if digit count 1000 to 10 -> 1221 ->22
            divisor /=100;
        }
        return 1;
    }

    public static void main(String[] args) {
        PalidromeInteger obj = new PalidromeInteger();
        System.out.println(obj.isPalindrome(1221));
        System.out.println(obj.isPalindrome(123));
        System.out.println(obj.isPalindrome(1));
    }

}
