package advance.class12_sortingII.homework;

public class MaxChunkToMakeArraySorted {

    public int solve(int[] A) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        int i =0;

        for(int a: A){
            max  = Math.max(max, a);
            if(i == max){
                count+=1;
            }
            i++;
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(new MaxChunkToMakeArraySorted().solve(new int[] {1, 2, 3, 4, 0}));
        System.out.println(new MaxChunkToMakeArraySorted().solve(new int[] {2, 0, 1, 3}));
    }

}
