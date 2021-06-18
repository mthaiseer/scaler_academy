package class09_strings.homework;

import java.util.HashSet;
import java.util.Set;

public class StringOperation {

    public String solve(String A) {

        if(A ==  null) return null;
        A = A+A;
        Set<Character> vowels  = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        char a[] = A.toCharArray();

        for(int i=0; i<a.length; i++){

            if(a[i] >= 65 && a[i] <=90){
                a[i] = '\0';
            }

            if(vowels.contains(a[i])){
                a[i] = '#';
            }

        }

        StringBuffer  buffer = new StringBuffer();
        for(int i=0; i<a.length; i++){
            if(a[i] ==  '\0') continue;
            buffer.append(a[i]);
        }


        return buffer.toString();
    }

    public static void main(String[] args) {
        StringOperation obj = new StringOperation();
        System.out.println(obj.solve("AbcaZeoB"));
        System.out.println(obj.solve("A"));
        System.out.println(obj.solve("e"));

    }
}
