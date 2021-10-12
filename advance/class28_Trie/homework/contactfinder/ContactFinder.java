package advance.class28_Trie.homework.contactfinder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactFinder {

    public int[] solve(int[] A, String[] B) {

        List<Integer> res = new ArrayList<>();
        ContactTrie trie = new ContactTrie();
        ContactTrieNode root = new ContactTrieNode('\0');

        int i = 0;
        for(int a: A){
            if(a == 0 ){
                trie.insert(B[i], root);
                i++;
            }


        }

        for(int a: A){
            if(a == 1){
                res.add(trie.search(B[i], root));
                i++;
            }



        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        ContactTrie trie  = new ContactTrie();

        int A[] =  new int[4];
        A[0] = 0;
        A[1] = 0;
        A[2] = 1;
        A[3] = 1;

        String B[] = new String[4];
        B[0] =  "hack";
        B[1] =  "hacker";
        B[2] =  "hac";
        B[3] =  "hak";

        Arrays.stream(new ContactFinder().solve(A, B)).forEach(it->{
            System.out.print(it +  "  ");
        });



    }
}
