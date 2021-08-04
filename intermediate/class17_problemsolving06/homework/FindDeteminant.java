package intermediate.class17_problemsolving06.homework;

public class FindDeteminant {

    public int solve(final int[][] A) {

        int N = A.length;
        int res = 0;
        if(N == 2){
            res = (A[0][0] * A[1][1]) - (A[0][1]* A[1][0]);
        }

        if(N ==3){

            res = (A[0][0] * ((A[1][1] * A[2][2]) - (A[1][2] * A[2][1]))) -
                    (A[0][1] * ( ((A[1][0])* (A[2][2])) -  ((A[1][2])* (A[2][0])))) +
                    (A[0][2] * ( ((A[1][0])* (A[2][1])) -  ((A[1][1])* (A[2][0]))));


        }


        return  res;

    }

    public static void main(String[] args) {

        int[][] D2 = {
                {1, 2},
                {3, 4}
        };

        System.out.println(new FindDeteminant().solve(D2));

        int [][] D3 = {
                {6, 1, 1},
                {4, -2, 5},
                {2, 8, 7}
        };

        System.out.println(new FindDeteminant().solve(D3));

    }

}
