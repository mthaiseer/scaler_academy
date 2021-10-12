package advance.class25_treesII.homework;

public class CheckBSTOneChild {


    public String solve(int[] A) {

        if(A == null || A.length ==0 ){
            return "NO";
        }

        int left = Integer.MIN_VALUE;
        int right = Integer.MAX_VALUE;
        int root = A[0];

        for(int i=1; i<A.length; i++){

            if(A[i] > root){
                left = root;
            }else{
                right = root;
            }

            if(A[i] < left|| A[i] > right){
                return "NO";
            }

            root = A[i];


        }


        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(new CheckBSTOneChild().solve(new int[] {4,10,5,8}));
        System.out.println(new CheckBSTOneChild().solve(new int[] {1, 5, 6, 4}));
    }
}
