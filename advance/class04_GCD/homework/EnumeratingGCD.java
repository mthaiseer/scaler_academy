package advance.class04_GCD.homework;

public class EnumeratingGCD {

    public String solve(String A, String B) {

        String one = "1";
        if(A.equals(B) ){
            return A;
        }

        return one;

    }

    public static void main(String[] args) {
        System.out.println(new EnumeratingGCD().solve("1", "3"));
        System.out.println(new EnumeratingGCD().solve("3412", "3412"));
    }
}
