package advance.class05_primefactors.classroom;

public class NumberOfOpenDoors {

    public int solve(int A) {

        int sqrt = (int )Math.sqrt(A);
        return (int)Math.floor(sqrt);
    }

    public static void main(String[] args) {
        System.out.println(new NumberOfOpenDoors().solve(100));
        System.out.println(new NumberOfOpenDoors().solve(5));
        System.out.println(new NumberOfOpenDoors().solve(6));
    }

}
