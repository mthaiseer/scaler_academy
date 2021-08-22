package advance.class05_primefactors.practice;

public class ExcelColumnTitlePractice {

    void test(int A){


        StringBuilder builder  = new StringBuilder();

        while(A > 0){
            int x = A%26;
            char c = (char)(x+'A'-1);
            builder.append(c);

            A =  A/26;
        }
        builder.reverse();
        System.out.println(builder);




    }

    public static void main(String[] args) {
        new ExcelColumnTitlePractice().test(19010);
        System.out.println();
        new ExcelColumnTitlePractice().test(28);
    }
}
