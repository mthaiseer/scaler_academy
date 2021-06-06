package class04_array_dynamicarrays.classroom;

import java.util.Scanner;

public class RotationGame {

    static void rotate(int A[], int left, int right){

        while(left<= right){

            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;

            left++;
            right--;

        }

    }

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);
        int t =  scanner.nextInt();
       while(t > 0){

           int n = scanner.nextInt();
           if(n <=0) return;
           int arr[]  = new int[n];

           for(int i=0; i<n; i++){
               arr[i] = scanner.nextInt();
           }
           int k = scanner.nextInt();

           k = k%n;

           int start =0;
           int end = n-1;
           int mid =  (n-1)  - k;

           rotate(arr, 0, mid);
           rotate(arr, mid+1, n-1);
           rotate(arr, 0, n-1);


           for(int x:arr){
               System.out.print(x+ " ");
           }
           System.out.println();
           t--;
       }
    }

}
