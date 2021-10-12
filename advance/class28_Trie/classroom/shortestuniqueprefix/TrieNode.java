package advance.class28_Trie.classroom.shortestuniqueprefix;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    public char data;
    Map<Character, TrieNode> map;
    int count;
    public boolean isEnd;


    public TrieNode(char c){
       this.data = data;
       map = new HashMap<>();
    }

}
