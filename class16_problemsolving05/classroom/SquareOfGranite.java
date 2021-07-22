package class16_problemsolving05.classroom;

public class SquareOfGranite {

    public int solve(int A, int B, int C) {

        int c1 = (int)Math.ceil((double)A/C);
        int c2 = (int) Math.ceil((double)B/C);
         return  c1*c2;
    }

    public static void main(String[] args) {
        SquareOfGranite obj = new SquareOfGranite();
        System.out.println(obj.solve(6,6,4));
    }

}
