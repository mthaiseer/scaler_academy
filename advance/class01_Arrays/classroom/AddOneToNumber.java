package advance.class01_Arrays.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddOneToNumber {

    public int[] plusOne(int[] A) {


        reverseArray(A);
        List<Integer> result = new ArrayList<>();

        int carry = 1;
        int i = 0;
        int N = A.length;
        while (i < N) {

            int sum = A[i] + carry;
            result.add(sum % 10);
            carry = sum / 10;
            i++;


        }
        if (carry > 0) {
            result.add(carry);
        }

        Collections.reverse(result);

        int start =0;
        while(true){

            if(result.get(start) == 0){
                result.remove(start);
            }else{
                break;
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }



    private void reverseArray(int[] a) {

        int i = 0;
        int n = a.length - 1;

        while (i < n) {
            int temp = a[i];
            a[i] = a[n];
            a[n] = temp;
            i++;
            n--;
        }
    }

    static void print(int A[]) {

        for (int x : A) {
            System.out.print(x + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
//        int A[] =  new AddOneToNumber().plusOne(new int[] {0, 1,2,3,4});
//        print(A);
//        int B[] = new AddOneToNumber().plusOne(new int[]{9, 9, 9});
//        print(B);
        int C[] = new AddOneToNumber().plusOne(new int[]{ 0, 6, 0, 6, 4, 8, 8, 1 });
        print(C);

    }

}
