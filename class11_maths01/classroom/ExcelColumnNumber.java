package class11_maths01.classroom;

public class ExcelColumnNumber {

    public int titleToNumber(String A) {
        int result = 0;
        for(int i=0; i<A.length(); i++){

            result = ((result * 26) +(A.charAt(i) - 'A'+1));

        }

        return result;

    }

    public static void main(String[] args) {
        ExcelColumnNumber obj = new ExcelColumnNumber();
        System.out.println(obj.titleToNumber("AA"));
        System.out.println(obj.titleToNumber("ABCD"));
    }
}
