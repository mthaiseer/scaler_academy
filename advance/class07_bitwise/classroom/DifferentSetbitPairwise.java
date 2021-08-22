package advance.class07_bitwise.classroom;

public class DifferentSetbitPairwise {

    public int cntBits(int[] A) {

        int M  = 1000000007;
        long ans  =0;
        int count =0;

        long n = A.length;

        for(int i=0; i<32; i++){

            count =0;
            for(int x: A){

                if((x & 1<<i) !=0){
                    count++;
                }

            }

            ans = ((ans%M)+  ((count *  (n -count)*2)%M)) %M;



        }

        return (int)ans;


    }

    public static void main(String[] args) {
        System.out.println(new DifferentSetbitPairwise().cntBits(new int[]{1,3,5}));
    }


}
