package advance.class28_Trie.practice;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    char data;
    public Map<Character, TrieNode> map = new HashMap<>();
    boolean isEnd;


    public TrieNode(char data){
        this.data = data;
    }

}
