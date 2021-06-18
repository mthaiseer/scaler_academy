package class09_strings.practice;

public class LexicographicallySort {

    int sort(int c1, int c2){

        String first  = ""+c1+c2;
        String second = ""+c2+c1;
        char[] c1arr = first.toCharArray();
        char[] c2arr = second.toCharArray();


        for(int i=0;i<first.length(); i++){

            if(c1arr[i] ==  c2arr[i]) continue;

            if(c1arr[i] > c2arr[i]){
                return 1;
            }else{
                return -1;
            }

        }


        return  -1;
    }

    String solve(int[] A){

        for(int i=0;i<A.length; i++){
            for (int j=i+1; j<A.length; j++){

                int sort = sort(A[i], A[j]);
                if (sort <0){
                    swapme(A, i, j);
                }
            }
        }

        StringBuilder builder = new StringBuilder();
        for(int a: A){
            builder.append(a);
        }
      return builder.toString();
    }

    private void swapme(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        LexicographicallySort obj = new LexicographicallySort();
        String  res =  obj.solve(new int[]{30,8, 3, 9, 5});
        System.out.println(res);



    }

}
