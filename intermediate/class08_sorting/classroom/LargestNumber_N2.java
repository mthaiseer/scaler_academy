package intermediate.class08_sorting.classroom;

public class LargestNumber_N2 {

    int sort(int c1, int c2){

        String first  = ""+c1+c2;
        String second = ""+c2+c1;
        char[] c1arr = first.toCharArray();
        char[] c2arr = second.toCharArray();


//        for(int i=0;i<first.length(); i++){
//
//            if(c1arr[i] ==  c2arr[i]) continue;
//
//            if(c1arr[i] > c2arr[i]){
//                return 1;
//            }else{
//                return -1;
//            }
//
//        }


        return new String(c1arr).compareTo(new String(c2arr));
    }




    public String largestNumber(final int[] A) {

        if(A == null || A.length ==0) return null;
        if(A.length == 1){
            return ""+A[0];
        }

        boolean allZeros  = true;
        for(int i=1; i<A.length; i++){
            if(A[i] != 0){
                allZeros = false;
            }
        }

        if(allZeros) return "0";


        for(int i=0;i<A.length; i++){
            for (int j=i+1; j<A.length; j++){

               int sort = sort(A[i], A[j]);

                if (sort <0){
                    swap(A, i, j);
                }
            }
        }

        StringBuilder builder = new StringBuilder();
        for(int a: A){
            builder.append(a);
        }
        return builder.toString();
    }


    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {

        LargestNumber_N2 obj = new LargestNumber_N2();
        String  res =  obj.largestNumber(new int[]{3, 30, 34, 5, 9});
        System.out.println(res);

        res =  obj.largestNumber(new int[]{2, 3, 9, 0});
        System.out.println(res);

        res =  obj.largestNumber(new int[]{9,9,9,9});
        System.out.println(res);

        res =  obj.largestNumber(new int[]{0,0,0,0});
        System.out.println(res);

        res =  obj.largestNumber(new int[]{1});
        System.out.println(res);


    }


}
