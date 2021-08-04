package intermediate.class09_strings.classroom;

public class IsApha {

    public int solve(char[] A) {


        for(int c: A){

            if(!((c >=  97 &&  c<=122 ) || (c>=65 && c<=90))){
                return 0;
            }

        }

        return 1;


    }

    public static void main(String[] args) {
        IsApha obj = new IsApha();
        System.out.println(obj.solve(new char[]{'a','z','A', 'Z'}));
        System.out.println(obj.solve(new char[]{'a','z','A', 'Z', '2'}));
        System.out.println(obj.solve(new char[]{'a','z','A', 'Z', 'c', 'm', 'n'}));
        System.out.println(obj.solve(new char[]{ 'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'}));
        System.out.println(obj.solve(new char[]{ 'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y'}));


    }


}
