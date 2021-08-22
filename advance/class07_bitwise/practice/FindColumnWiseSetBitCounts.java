package advance.class07_bitwise.practice;

public class FindColumnWiseSetBitCounts {

    int findCount(int A[]){

        int count =0;
        for(int i=0; i<=31; i++){

            for(int x: A){

                x =  (x>>i);
                if(( x&1) == 1){
                    count++;
                }
            }

        }

        return count;

    }

    public static void main(String[] args) {
        //14 = 1110 and 15 1111 total 1s 7
        System.out.println(new FindColumnWiseSetBitCounts().findCount(new int[]{14, 15}));


        int a  = 1<<2;
        System.out.println(a);
    }




}
