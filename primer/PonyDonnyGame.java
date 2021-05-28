package primer;

public class PonyDonnyGame {


    public static String solve(int A) {
        if(A == 2){
            return "Donny";
        }
        return "Ponny";
    }

    public static void main(String[] args) {
        System.out.println(solve(1));
        System.out.println(solve(2));
        System.out.println(solve(3));
        System.out.println("4 :"+ solve(4));
       System.out.println("5 :"+  solve(5));
        System.out.println("7 : "+solve(7));
        System.out.println("8 : "+solve(8));
    }


}
