package mis;

public class Recursion {


    void rec(int A[], int k){

        if(k  == A.length){
            return;
        }

        for(int i=k ; i<A.length; i++){
            System.out.println("BEFORE " + k + " "+ i);
            rec(A, k+1);
            System.out.println("AFTER " + k + " "+ i);
        }

    }

    public static void main(String[] args) {
        int A[] =  {1,2,3};
        new Recursion().rec(A, 0);
    }
}
