package class09_strings.classroom;

public class RotateString {

    public String solve(String A, int B) {

        int N = A.length();
        char aChar[] = A.toCharArray();



        B = B%N;

        int start = 0;
        int limit = (N - B) - 1;
        while (start <= limit) {
            swap(aChar, start, limit);
            start++;
            limit--;
        }

        start = (N - B);
        int end = N - 1;

        while (start <= end) {
            swap(aChar, start, end);
            start++;
            end--;
        }

        start = 0;
        end = N - 1;

        while (start < end) {
            swap(aChar, start, end);
            start++;
            end--;
        }

        return new String(aChar);
    }

    void swap(char c[], int left, int right) {
        char temp = c[left];
        c[left] = c[right];
        c[right] = temp;
    }

    public static void main(String[] args) {
        RotateString obj = new RotateString();
        System.out.println(obj.solve("scaler", 2));
        System.out.println(obj.solve("academy", 7));
        System.out.println(obj.solve("jadgbxjesitcdbnbkftdv", 29));
    }

}
