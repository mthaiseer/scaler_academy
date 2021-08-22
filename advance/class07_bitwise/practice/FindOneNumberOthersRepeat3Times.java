package advance.class07_bitwise.practice;

public class FindOneNumberOthersRepeat3Times {

    int findOdd(int [] A){

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
        System.out.println(new FindOneNumberOthersRepeat3Times().findOdd(new int[]{4,8,10,4,4,8,8}));
    }

}
