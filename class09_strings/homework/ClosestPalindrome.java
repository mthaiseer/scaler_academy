package class09_strings.homework;

public class ClosestPalindrome {

    public String solve(String A) {

        if(A == null) return "NO";

       String B  = new StringBuilder(A).reverse().toString();

       int mismatches  =0;
       for(int i=0; i<A.length(); i++){

           if(A.charAt(i) != B.charAt(i)){
               mismatches++;
           }

           if(mismatches > 2) return "NO";

       }

       if(mismatches == 0 && A.length() %2 == 0) return  "NO";

        return "YES";
    }

    public static void main(String[] args) {
        ClosestPalindrome obj = new ClosestPalindrome();
        System.out.println(obj.solve("abbba"));
        System.out.println(obj.solve("malayalam"));
        System.out.println(obj.solve("abba"));
        System.out.println(obj.solve("aaaaaaaaaabaaaaaaaaa"));
    }

}
