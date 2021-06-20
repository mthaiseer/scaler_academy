package class10_recursion.homework;

public class SumOfDigits {

    public int solve(int A) {

        return  (A  == 0) ?  0 : A %10 + solve(A/10);


    }

    public static void main(String[] args) {
        SumOfDigits obj = new SumOfDigits();
        System.out.println(obj.solve(46));
        System.out.println(obj.solve(11));
    }

}
