package class05_2DArrays.classroom;

public class SprialOrderMatrix {

    public static int[][] generateMatrix(int A) {

        int [][] result = new int[A][A];

        int top = 0;
        int right = A-1;
        int bottom = A-1;
        int left = 0;

        int counter =1;

        while(top<=right && left <=bottom){

            for(int i=top; i<=right; i++){
                result[top][i] = counter++;
            }
            top++;

            for(int i=top; i<=bottom; i++){
                result[i][right] = counter++;
            }
            right--;

            for(int i=right; i>=left; i--){
                result[bottom][i] = counter++;
            }

            bottom--;

            for(int i=bottom; i>=top; i--){
                result[i][left] =  counter++;
            }
            left++;

        }

        return result;
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

        int [][] R = generateMatrix(3);
        simpleTraversal(R);

    }


}
