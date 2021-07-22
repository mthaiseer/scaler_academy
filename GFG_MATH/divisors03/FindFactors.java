package GFG_MATH.divisors03;

public class FindFactors {


    void printFactorsBetterOrdered(int N){

        int j =0;

        for(int i=1; i*i <=N; i++){
            j =i;
            if(N % i == 0) System.out.print(i+ " ");
        }
        for(int k = j; k>=1; k--){

            if(N %k ==0){
                System.out.print(N/k+ " ");
            }

        }
    }

    void printFactorsBetterUnordered(int N){

        for(int i=1; i*i <=N; i++){

            if(N %i  ==0){

                System.out.print(i+  " ");

                if(i!= N/i){
                    System.out.print(" "+ N/i + " ");
                }
            }
        }
        System.out.println();
    }

    void printFactorsNaive(int N){

        for(int i=1; i<=N; i++){
            if( (N % i )  == 0){
                System.out.print(i +  " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FindFactors obj = new FindFactors();
        obj.printFactorsNaive(25);
        obj.printFactorsBetterUnordered(1000);
        obj.printFactorsBetterOrdered(1000);
    }
}
