package advance.class05_primefactors.homework;

public class ExcelColumnTitle {


    public String convertToTitle(int A) {


        StringBuilder builder  = new StringBuilder();
        while(A > 0){
            int x = (int)Math.floor((A-1)%26);
            char c = (char)(x+'A');
            builder.append(c);
             A =  (A-1)/26;
            System.out.println(c + " -->"+ x + "-->"+A);

        }
        builder.reverse();
        return builder.toString();

    }




    public static void main(String[] args) {
        System.out.println(new ExcelColumnTitle().convertToTitle(943566));//BAQTZ
        System.out.println(new ExcelColumnTitle().convertToTitle(28));
    }
}
