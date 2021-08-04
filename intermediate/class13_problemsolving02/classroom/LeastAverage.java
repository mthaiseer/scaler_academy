package intermediate.class13_problemsolving02.classroom;

public class LeastAverage {


    public int solve(int[] A, int B) {

        int start = 0;
        int end = 0;
        float globalAvg  = Float.MAX_VALUE;
        float sum  =0;
        int idx = 0;

        for(end=0; end<A.length;end++){

            sum+= A[end];
            if(end >= B-1){

                float localAvg = sum/B;
                if(localAvg < globalAvg){

                    idx = start;
                    globalAvg = localAvg;

                }

                sum -= A[start];
                start++;
            }
        }
        return idx;
    }


    public static void main(String[] args) {
        LeastAverage obj  = new LeastAverage();
        System.out.println(obj.solveBruteForce(new int[]{3, 7, 90, 20, 10, 50, 40}, 3));
        System.out.println(obj.solveBruteForce(new int[]{3, 7, 5, 20, -10, 0, 12}, 2));
       System.out.println(obj.solveBruteForce(new int[]{20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11 }, 9));
        System.out.println(obj.solveBruteForce(new int[]{15, 7, 11, 7, 9, 8, 18, 1, 16, 18, 6, 1, 1, 4, 18 }, 6));//7
        System.out.println(obj.solveBruteForce(new int[]{3, 16, 11, 13, 19, 17, 11, 4, 9, 9, 6, 7, 3, 6, 12, 3, 4, 15, 5, 19}, 1));

        System.out.println("-----------------NAIVE -----------------------");
        System.out.println(obj.solve(new int[]{3, 7, 90, 20, 10, 50, 40}, 3));
        System.out.println(obj.solve(new int[]{3, 7, 5, 20, -10, 0, 12}, 2));
        System.out.println(obj.solve(new int[]{20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11 }, 9));
        System.out.println(obj.solve(new int[]{15, 7, 11, 7, 9, 8, 18, 1, 16, 18, 6, 1, 1, 4, 18 }, 6));
        System.out.println(obj.solve(new int[]{3, 16, 11, 13, 19, 17, 11, 4, 9, 9, 6, 7, 3, 6, 12, 3, 4, 15, 5, 19}, 1));

    }

    public int solveBruteForce(int[] A, int B) {

        float globalAvg  = Float.MAX_VALUE;
        int idx = Integer.MAX_VALUE;
        float leastAvg = 0.0f;

        for(int i=0; i <= (A.length-B); i++){

            float currentSum = 0.0f;
            for(int j=i; j< (i+B); j++){
                currentSum+=A[j];
            }

            float average = currentSum/B;

            //System.out.println("Sum "+ currentSum + " AVG "+ average + " "+ i);

            if(average < globalAvg){
              // System.out.println("AVARAGE "+ average);
                idx = i;
                globalAvg = Math.min(average, globalAvg);
            }

        }

        return idx;
    }


}

