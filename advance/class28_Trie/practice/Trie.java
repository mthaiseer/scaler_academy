package advance.class28_Trie.practice;

import javax.swing.tree.TreeNode;

public class Trie {

    boolean search(String  data, TrieNode root){
        TrieNode tempRoot  = root;

        for(int i=0; i<data.length(); i++){

            char key = data.charAt(i);

            if(!tempRoot.map.containsKey(key)){
               return false;
            }
            tempRoot = tempRoot.map.get(key);

        }

        return tempRoot.isEnd;

    }

    void insert(String  data, TrieNode root){
        TrieNode tempRoot  = root;

        for(int i=0; i<data.length(); i++){

            char key = data.charAt(i);

            if(!tempRoot.map.containsKey(key)){
                tempRoot.map.put(key, new TrieNode(key));
            }
            tempRoot = tempRoot.map.get(key);

        }

        tempRoot.isEnd = true;

    }


    public static void main(String[] args) {
        Trie trie  = new Trie();

        TrieNode root = new TrieNode('\0');
        trie.insert("india", root);
        trie.insert("ind", root);
        trie.insert("and", root);

        System.out.println(trie.search("india", root));
        System.out.println(trie.search("in", root));
        System.out.println(trie.search("and", root));
        System.out.println(trie.search("bbb", root));
    }

}
