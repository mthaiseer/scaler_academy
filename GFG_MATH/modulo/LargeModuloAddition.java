package GFG_MATH.modulo;

public class LargeModuloAddition {

    int add(long arr[]){

        int M = 1000000007;
        int res = 0;

        for(int i=0; i<arr.length; i++){
            res =  (int)(res + arr[i] %M)  %M;
        }

        return  res;

    }

    public static void main(String[] args) {
        long arr[]  =  {2330003000233444450L, 3330003000233444450L, 2730003000233444450L, 6330003000233444450L};
        System.out.println(new LargeModuloAddition().add(arr));

    }

}
