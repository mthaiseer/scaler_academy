package advance.class28_Trie.classroom.shortestuniqueprefix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestUniquePrefix {

    public String[] prefix(String[] A) {

        Trie trie = new Trie();
        List<String> res = new ArrayList<>();
         for(String a: A){
            trie.insert(a);
        }

        for(String a: A){
            String r = trie.search(a);
            res.add(r);
        }

       String [] sres = new String[res.size()];
        int i = 0;
        for(String s: res){
            sres[i] = s;
            i++;
        }

        return sres;
    }

    public static void main(String[] args) {
        String S[]  = {"zebra", "dog", "duck", "dove"};
        String res[] = new ShortestUniquePrefix().prefix(S);

        Arrays.stream(res).forEach(it ->{
            System.out.print(it + " ");
        });
    }

}
