package advance.class13_searching01.practice;

public class BinarySearch {

    int binarySearch(int A[] , int N, int k){

        int start = 0;
        int end = N-1;


        while(start<=end){

            int mid = (end+ start)/2;

            if(A[mid] == k){
                return mid+1;
            }else  if(A[mid] > k){
                end = mid -1;
            }else{
                start = mid+1;
            }



        }

        return -1;
    }

    public static void main(String[] args) {
       System.out.println(new BinarySearch().binarySearch(new int[] {1,2,3,5,7,8,11,40},8, 11));
        System.out.println(new BinarySearch().binarySearch(new int[] {1,2,3,5,7,8,11,40},8, 1));
        System.out.println(new BinarySearch().binarySearch(new int[] {1,2,3,5,7,8,11,40},8, 40));
        System.out.println(new BinarySearch().binarySearch(new int[] {1,2,3,5,7,8,11,40},8, 1000));
    }
}
