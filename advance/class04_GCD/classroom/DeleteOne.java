package advance.class04_GCD.classroom;

public class DeleteOne {

    public int solve(int[] A) {

        int N = A.length;
        int prefixGCD[] = new int[A.length];
        int suffixGCD[] = new int[A.length];

        int maxGdcExludeCurrent = 0;


        prefixGCD[0] = A[0];
        for(int i=1; i<A.length; i++){
            prefixGCD[i] =  gcd(A[i], prefixGCD[i-1]);
        }

        suffixGCD[N-1] = A[N-1];
        for(int i = N-2; i>=0; i--){
            suffixGCD[i] = gcd(A[i], suffixGCD[i+1]);
        }

        for(int i=0; i<A.length; i++){

            if((i-1) < 0){
                maxGdcExludeCurrent = Math.max(maxGdcExludeCurrent, suffixGCD[i+1]);
            }else if((i+i) >=N){
                maxGdcExludeCurrent = Math.max(maxGdcExludeCurrent, prefixGCD[i-1]);
            }else{
                maxGdcExludeCurrent = Math.max(maxGdcExludeCurrent, gcd(prefixGCD[i-1], suffixGCD[i+1]));
            }
        }
        return maxGdcExludeCurrent;

    }

    int gcd(int A, int B){
        if(B  == 0) return A;
        return gcd(B, A%B);

    }

    public static void main(String[] args) {
        DeleteOne obj = new DeleteOne();
        System.out.println(obj.solve(new int[] {15, 18, 25, 20, 60 }));
        System.out.println(obj.solve(new int[] {5, 15, 30 }));
        System.out.println(obj.solve(new int[] {12, 15, 18 }));
    }
}
