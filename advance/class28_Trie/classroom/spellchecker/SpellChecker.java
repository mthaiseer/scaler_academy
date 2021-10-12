package advance.class28_Trie.classroom.spellchecker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpellChecker {


    public int[] solve(String[] A, String[] B) {

        SpellCheckerTrie spellCheckerTrie = new SpellCheckerTrie();
        List<Integer> result = new ArrayList<>();

       for(String a: A){
           spellCheckerTrie.insertWord(a);
       }

       for(String b: B){

           boolean isFound = spellCheckerTrie.search(b);
           result.add(isFound ? 1: 0);

       }

       return result.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {
        SpellChecker obj = new SpellChecker();

        String[] A = new String[3];
        A[0]= "hat";
        A[1]= "cat";
        A[2]= "rat";


        String[] B = new String[2];
        B[0]= "hat";
        B[1]= "ball";


        Arrays.stream(obj.solve(A, B)).forEach(it->{
            System.out.println(it);
        });


    }
}

class SpellCheckerTrie{

    TrieNode root;

    public SpellCheckerTrie(){
        root = new TrieNode('\0');
    }

    void insertWord(String word){

        TrieNode temp = root;

        for(int i=0; i<word.length(); i++){

            if(!temp.map.containsKey(word.charAt(i))){

                TrieNode node = new TrieNode(word.charAt(i));
                temp.map.put(word.charAt(i), node);
            }
            temp = temp.map.get(word.charAt(i));
        }
        temp.isEnd = true;
    }

    boolean search(String word){

        TrieNode temp  = root;

        for(int i = 0; i<word.length(); i++){

            if(!temp.map.containsKey(word.charAt(i))){
                return false;
            }
            temp = temp.map.get(word.charAt(i));

        }
        return temp.isEnd;
    }







}
