package advance.class16_strings.classroom;

public class ReverseString {

    public String solve(String A) {

        int lastSpace  = A.length();
        StringBuffer buffer = new StringBuffer();
        for(int i=A.length()-1; i>=0; i--){

            if(A.charAt(i) == ' ' || i==0){
                String str= A.substring(i ==0 ? 0 : i+1, lastSpace);
                buffer.append(str);
                lastSpace = i;
                if(i != 0 || i != A.length()){
                    buffer.append(" ");
                }
            }

        }


        return buffer.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseString().solve("This is an example"));
        System.out.println(new ReverseString().solve("this is ib"));
        System.out.println(new ReverseString().solve("this"));
        System.out.println(new ReverseString().solve(""));
    }

}
