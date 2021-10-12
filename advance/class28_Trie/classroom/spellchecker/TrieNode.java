package advance.class28_Trie.classroom.spellchecker;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    public char data;
    Map<Character, TrieNode> map;
    public boolean isEnd;


    public TrieNode(char c){
       this.data = data;
       map = new HashMap<>();
    }

}
