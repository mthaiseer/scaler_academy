package advance.class13_searching01.practice;

import advance.class13_searching01.classroom.RotatedSortedSearchArray;

public class SearchInSortedRotated {

    int binarySearch(int A[], int k){

        int start =0;
        int end = A.length-1;

        while(start <= end){


            int mid = (start+end)/2;

            if(k == A[mid]){
                return mid;
            }

            if(A[start] <= A[mid]){

                if(k >= A[start] && k<=A[mid]){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            }else{
                if(k >= A[mid] && k<= A[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new RotatedSortedSearchArray().search(new int[]{4,5,1,2,3}, 2));
        System.out.println(new RotatedSortedSearchArray().search(new int[]{4,5,1,2,3}, 4));
        System.out.println(new RotatedSortedSearchArray().search(new int[]{4,5,1,2,3}, 5));
        System.out.println(new RotatedSortedSearchArray().search(new int[]{4,5,1,2,3}, 3));
    }

}
