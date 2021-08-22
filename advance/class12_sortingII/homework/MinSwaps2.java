package advance.class12_sortingII.homework;

public class MinSwaps2 {

    /**
     * TODO check current not at current index, then search current index and swap + increment result
     * @param A
     * @return
     */
    public int solve(int[] A) {

        int count = 0;
        int nextIndex =-1;

        for(int i=0; i<A.length; i++){

            if(A[i] != i){

                for(int j=i+1; j<A.length; j++){
                    if(A[j] ==  i){
                        nextIndex =j;
                        break;
                    }
                }
                swap(A, nextIndex, i);
                count++;

            }

        }

        return count;

    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j]= temp;

    }

    public static void main(String[] args) {
        System.out.println(new MinSwaps2().solve(new int[] {1,2,3,4,0}));
        System.out.println(new MinSwaps2().solve(new int[] {2, 0, 1, 3}));
    }

}
