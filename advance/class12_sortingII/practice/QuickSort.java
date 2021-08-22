package advance.class12_sortingII.practice;

public class QuickSort {


    void sort(int A[], int low, int high) {

        if (low >= high) {
            return;
        }
        int pivot = A[high];
        int partition = partition(A, low, high, pivot);

        sort(A, low, partition - 1);
        sort(A, partition + 1, high);
    }


    int partition(int A[], int low, int high, int pivot) {

        int idx = (low - 1);
        for (int i = low; i < high; i++) {

            if (A[i] <= pivot) {
                idx++;
                swap(A, idx, i);
            }
        }
        swap(A, idx + 1, high);
        return idx + 1;
    }

    void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {

        int A[] = {20, 10, 9, 6, 4, 3, 1};

        new QuickSort().sort(A, 0, A.length - 1);


        for (int a : A) {
            System.out.print(a + " ");
        }

    }

}
