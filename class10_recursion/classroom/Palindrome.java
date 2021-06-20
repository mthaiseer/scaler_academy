package class10_recursion.classroom;

public class Palindrome {

    public int solve(String A) {

        return solve(A, 0, A.length()-1);
    }

    private int solve(String A, int left, int right) {

        if(left> right) return 1;
        return A.charAt(left) !=  A.charAt(right)? 0:solve(A, left+1, right-1);

    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        System.out.println(obj.solve("naman"));
        System.out.println(obj.solve("strings"));
        System.out.println(obj.solve("s"));
        System.out.println(obj.solve("ss"));
        System.out.println(obj.solve("sa"));
    }
}
