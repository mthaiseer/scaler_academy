package intermediate.class11_maths01.basics;

public class Basics {

    public static void main(String[] args) {
        // System.out.println( ((-5 % 12) + 12 )%12);

        double A = Math.pow(37 % 12, 103);
        System.out.println(A);
        double res = (A - (1 % 12)) % 12;
        System.out.println(res);
    }
}
