package class10_recursion.classroom;

public class Fibonacci {

    public int findAthFibonacci(int A) {
        if(A  ==0 ) return 0;
        if(A  ==1 ) return 1;

        return  findAthFibonacci(A-1)+findAthFibonacci(A-2);
    }

    public static void main(String[] args) {

        Fibonacci obj = new Fibonacci();
        System.out.println(obj.findAthFibonacci(20));
    }


}
