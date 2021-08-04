package intermediate.class09_strings.classroom;

public class IsAlphaNum {

    public int solve(char[] A) {

        for(int i=0; i<A.length; i++){

            int c = A[i];
            if(! ((c>=48 && c<=57) || (c>=97 && c<=122) || (c>=65 && c<=90))){
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        IsAlphaNum obj = new IsAlphaNum();
        System.out.println(obj.solve(new char[]{'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'}));
        System.out.println(obj.solve(new char[]{'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'}));
    }

}
