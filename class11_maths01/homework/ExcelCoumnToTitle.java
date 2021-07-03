package class11_maths01.homework;

public class ExcelCoumnToTitle {

    public String convertToTitle(int A) {

        StringBuilder builder = new StringBuilder();
        while(A >0){

            A = A-1;
           int i = (char) ((A % 26))+ 'A';
           char ch = (char)i;
           builder.append(ch);
            A = A/26;
        }
      builder.reverse();
      return builder.toString();
    }

    public static void main(String[] args) {
        ExcelCoumnToTitle obj = new  ExcelCoumnToTitle();
        System.out.println(obj.convertToTitle(943566));

    }

}
