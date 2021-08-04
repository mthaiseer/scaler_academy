package advance.class05_primefactors;

public class OddFibonacci {

    public int solve(int A, int B) {

        int result  = 0;

        int x  = (int ) ((int )(Math.floor(B/3)) - Math.floor((A-1)/3));

        result = ((B-A)+1) - x ;


        return result;
    }

    public static void main(String[] args) {
        OddFibonacci obj = new OddFibonacci();
        System.out.println(obj.solve(2, 6));
        System.out.println(obj.solve(6, 20));
    }

}
