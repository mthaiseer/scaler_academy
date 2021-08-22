package advance.class05_primefactors.homework;

public class ExcelColumnNumber {

    public int titleToNumber(String A) {

        int result  =0;

        for(int i=0; i<A.length(); i++){


            int digit  = A.charAt(i) - 'A'+1;
            result = result * 26 + digit;

        }


        return result;

    }

    public static void main(String[] args) {
        System.out.println(new ExcelColumnNumber().titleToNumber("AB"));
        System.out.println(new ExcelColumnNumber().titleToNumber("ABCD"));
    }


}
