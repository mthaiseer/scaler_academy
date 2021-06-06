package class05_2DArrays.playground;

public class TwoDArrayTraversals {



    static void printDiagonals(int arr[][]){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<=i;j++){

                if(i == j){
                    System.out.println(arr[i][j]);
                }else{
                    System.out.println(arr[j][i] + " "+ arr[i][j] + " " );
                }

            }

        }

    }


    static void printDiagonalsDigits(int arr[][]){

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<=i;j++){
                System.out.print(arr[i][j] + " ");
            }
        }

    }


    private static void simpleTraversal(int arr[][]){

       for(int i=0; i<arr.length; i++){

           for(int j=0; j<arr[i].length; j++){

               System.out.print(arr[i][j] + " ");

           }
           System.out.println();

        }

    }


    public static void main(String[] args) {

        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //simpleTraversal(arr);
       // printDiagonalsDigits(arr);
        printDiagonals(arr);

    }
}
