package class11_maths01.homework;

import class05_2DArrays.classroom.PascalTriangle;

public class ReverseInteger {

    public int reverse(int A) {

        boolean isNegetive = false;
        if(A <0 ) {
            A= A* -1;
            isNegetive = true;
        }

        int result =0;
        while(A != 0) {

            int lastDigit  = A%10;
            if(result >= Integer.MAX_VALUE /10 -lastDigit){
                return 0;
            }
            result = result * 10+ lastDigit;
            A /=10;


        }
        return isNegetive ? result*-1 : result;
    }

    public static void main(String[] args) {
        ReverseInteger obj = new ReverseInteger();
//        System.out.println(obj.reverse(-123));
//        System.out.println(obj.reverse(-1146467285));
        System.out.println(obj.reverse(-1146467285));

    }



}
