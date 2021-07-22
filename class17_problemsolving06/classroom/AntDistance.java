package class17_problemsolving06.classroom;

public class AntDistance {

    public int solve(int A, int[] B, int[] C) {

        int maxDistance  = Integer.MIN_VALUE;
        int end  = A;

        for(int i=0; i<B.length; i++){
            maxDistance = Math.max(maxDistance, (B[i] -0));
        }

        for(int i=0; i<C.length; i++){
            maxDistance = Math.max(maxDistance, (end -C[i]));
        }

        return maxDistance;
   }

    public static void main(String[] args) {
        int B[] = {4,3}; //left
        int C[] = {0,1}; //right

        AntDistance obj = new AntDistance();
        System.out.println(obj.solve(4, B, C));

        int B1[] = {5};
        int C1[]= {4};
        System.out.println(obj.solve(9, B1, C1));


    }

}
