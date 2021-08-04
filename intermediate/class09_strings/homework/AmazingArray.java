package intermediate.class09_strings.homework;

import java.util.HashSet;
import java.util.Set;

public class AmazingArray {

    public int solveBrute(String A) {

        Set<Character> vowels  = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char a[] = A.toCharArray();
        int count =0;
        int currentIndex;
        for(int i=0; i<a.length; i++){

            if(vowels.contains(a[i])){

                currentIndex = i;
                while(currentIndex < a.length){
                    currentIndex++;
                    count++;
                }
            }
        }
        return count % 10003;
    }

    public static void main(String[] args) {
        AmazingArray obj = new AmazingArray();
        System.out.println(obj.solveBrute("ABEC"));
        System.out.println(obj.solveBrute("A"));
        System.out.println(obj.solveBrute("b"));

    }

}
