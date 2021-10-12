package advance.class28_Trie.homework.contactfinder;

import java.util.HashMap;
import java.util.Map;

public class ContactTrieNode {
    char data;
    public Map<Character, ContactTrieNode> map = new HashMap<>();
    boolean isEnd;
    int count = 0;


    public ContactTrieNode(char data){
        this.data = data;
    }

}
