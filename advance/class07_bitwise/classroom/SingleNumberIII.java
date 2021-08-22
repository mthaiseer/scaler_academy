package advance.class07_bitwise.classroom;

public class SingleNumberIII {

    public int[] solve(int[] A) {


        int res[] = new int[2];
        int xor =0;
        for(int a: A){
            xor^= a;
        }

        int mask = (xor&(xor-1))^xor;

        int a =0;
        int b = 0;

        for(int x : A){

            if((x & mask) !=0){
                a = a ^ x;
            }else {
                b = b ^ x;
            }
        }

        res[0] = Math.min(a, b);
        res[1] = Math.max(a,b);




        return res;
    }

    public static void main(String[] args) {
       // int A[] =  new SingleNumberIII().solve(new int[]{1, 2, 3, 1, 2, 4});
        int A[] =  new SingleNumberIII().solve(new int[]{186, 256, 102, 377, 186, 377 });
        for (int a: A){
            System.out.println(a);
        }
    }
}
