package class08_sorting.classroom;

public class KthSmallestElement {

    public int kthsmallest(final int[] A, int B) {

        int minval =Integer.MAX_VALUE;
        for(int i=0; i<B; i++){

            minval =Integer.MAX_VALUE;
            int minIndex = -1;

            for(int j=i; j<A.length;j++){

                if(A[j] < minval){
                    minval  = Math.min(minval, A[j]);
                    minIndex = j;
                }



            }
           swapme(A, i, minIndex);

        }


        return minval;
    }

    private void swapme(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }


    public static void main(String[] args) {
        KthSmallestElement obj = new KthSmallestElement();
        System.out.println(obj.kthsmallest(new int[] {2, 1, 4, 3, 2}, 3));
        System.out.println(obj.kthsmallest(new int[] {1, 2}, 2));
    }

}
