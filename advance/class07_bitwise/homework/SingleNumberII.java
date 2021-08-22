package advance.class07_bitwise.homework;

public class SingleNumberII {

    public int singleNumber(final int[] A) {

        int ans =0;

        for(int i=0; i<=31; i++){

            int count =0;
            for(int x: A){

                x  =  x >> i;
                if( (x&1) ==1){
                    count++;
                }
            }

            if(count%3 != 0){
                ans+= (1<<i);//finally ans set to 0101 = 5 by shifting ith if count %3 not 0
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new SingleNumberII().singleNumber(new int[] {1, 2, 4, 3, 3, 2, 2, 3, 1, 1}));
        System.out.println(new SingleNumberII().singleNumber(new int[] {0,0,0,1}));
    }


}
