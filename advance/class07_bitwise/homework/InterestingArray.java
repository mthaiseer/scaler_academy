package advance.class07_bitwise.homework;

public class InterestingArray {

    public String solve(int[] A) {

        int oddCount =0;

        for(int x: A){
            if(x%2 != 0){
                oddCount++;
            }

        }
        if(oddCount%2  == 0){
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {
        System.out.println(new InterestingArray().solve(new int[]{9, 17}));
        System.out.println(new InterestingArray().solve(new int[]{1}));
    }

}
