package advance.class11_sortingI.practice;

import java.util.Arrays;

public class MergeSort {


    int[] sort(int A[]){

        int start = 0;
        int end = A.length-1;
        mergeSort(A, start, end);
        return A;

    }

    private void mergeSort(int[] A, int start, int end) {
          if(start<end){

              int mid = (start+end)/2;
              mergeSort(A, start, mid);
              mergeSort(A, mid+1, end);
              merge(A, start, mid, end);
          }
    }

    private void merge(int[] a, int start, int mid, int end) {
        int [] temp = new int[(end-start)+1];

        int i = start;
        int j = mid+1;

        int k = 0;

        while(i <=mid && j <=end){

            if(a[i] < a[j]){
                temp[k] = a[i];
                i++;
                k++;
            }else {
                temp[k] = a[j];
                j++;
                k++;
            }

        }

        while(i <= mid){
            temp[k] = a[i];
            i++;
            k++;
        }

        while(j<= end){
            temp[k] = a[j];
            j++;
            k++;
        }

        int c =0;
        for(int m=start; m<=end; m++){
            a[m] = temp[c++];
        }
    }

    public static void main(String[] args) {
        Arrays.stream(new MergeSort().sort(new int[] {20, 10, 9, 1, -9, 100,3})).forEach(it->{
            System.out.print(it+ " ");

        });
    }


}
