package intermediate.class09_strings.classroom;

public class ToUpper {

    public char[] to_upper(char[] A) {

        for(int i=0; i<A.length; i++){

            if(A[i] >=97 && A[i] <=122){
                A[i] =(char) (A[i] - 32);
            }
        }

        return A;

    }

    public static void main(String[] args) {
        ToUpper obj = new ToUpper();
       char  A[] = obj.to_upper(new char[]{'S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'});

        for(char c: A){
            System.out.print(c+ " ");
        }
        System.out.println();

        char  B[] = obj.to_upper(new char[]{'S', 'c', 'a', 'L', 'e', 'R', '#', '2', '0', '2', '0'});

        for(char c: B){
            System.out.print(c+ " ");
        }
    }

}
