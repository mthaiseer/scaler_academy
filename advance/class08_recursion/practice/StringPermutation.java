package advance.class08_recursion.practice;

public class StringPermutation {

    void permute(String input, int l, int r) {

        if (l == r) {
            System.out.println(input);
            return;
        }
        for (int i = l; i <= r; i++) {

            input = swap(input, l, i);
            permute(input, l + 1, r);
            input = swap(input, l, i);


        }


    }

    String swap(String input, int i, int j) {

        char arr[] = input.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);

    }

    public static void main(String[] args) {
        String input = "ABC";
        new StringPermutation().permute(input, 0, input.length() - 1);
    }

}
