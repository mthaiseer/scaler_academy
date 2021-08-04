package intermediate.class02_NumberBitManipulation.homework;

public class AddBinaryString {

    public static String addBinary(String A, String B) {

        String sum = "";
        int carry = 0;


        int aLength = A.length()-1;
        int bLength = B.length()-1;

        while(aLength>= 0 || bLength>=0 || carry ==1){
            carry+= aLength>= 0 ? A.charAt(aLength) - '0': 0;
            carry+= bLength>= 0 ? B.charAt(bLength)- '0': 0;

            sum = (carry % 2)+ sum;

            carry= carry/2;
            aLength--;
            bLength--;


        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("111", "11"));

    }
}
