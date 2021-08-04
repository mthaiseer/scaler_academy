package intermediate.class13_problemsolving02.classroom;

public class EquilibriumPoint {
    public int solve(int[] A) {

        int rightSum  = 0;
        int leftSum  =0;

        for(int a:A){
            rightSum+=a;
        }

        for(int i=0; i<A.length; i++){

             leftSum = i == 0 ? leftSum+0: leftSum+A[i-1];
             rightSum = rightSum - A[i];

             if(leftSum == rightSum){
                 return i;
             }

        }


        return -1;
    }

    public static void main(String[] args) {

        EquilibriumPoint obj = new EquilibriumPoint();
        System.out.println(obj.solve(new int[] {-7,1,5,2,-4,3,0}));
        System.out.println(obj.solve(new int[] {1}));
        System.out.println(obj.solve(new int[] {1, 2}));
        System.out.println(obj.solve(new int[] {1, 2, 3}));

    }

}
