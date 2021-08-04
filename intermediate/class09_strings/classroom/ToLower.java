package intermediate.class09_strings.classroom;

public class ToLower {

    public char[] to_lower(char[] A) {

        for(int i=0; i<A.length; i++){

            if(A[i] >=65 && A[i] <=90){
                A[i] =(char) (A[i] + 32);
            }
          }

        return A;
    }

    public static void main(String[] args) {
        ToLower obj = new ToLower();
        char A[] = obj.to_lower(new char[] {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'});

        for(char c: A){
            System.out.print(c+ " ");
        }

        System.out.println();

        char B[] = obj.to_lower(new char[] {'S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0'});

        for(char c: B ){
            System.out.print(c+ " ");
        }
    }


}
