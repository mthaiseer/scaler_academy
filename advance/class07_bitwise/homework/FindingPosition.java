package advance.class07_bitwise.homework;

public class FindingPosition {

    public int solve(int A) {

        int i =1;

        while(i <= A/2){
            i*=2;
        }

        return i;

    }

    public static void main(String[] args) {
        System.out.println(new FindingPosition().solve(10));
        System.out.println(new FindingPosition().solve(17));
    }

}
