package advance.class28_Trie.homework.contactfinder;


public class ContactTrie {




    int  search(String  data, ContactTrieNode root){
        ContactTrieNode tempRoot  = root;
        int count = 0;

        for(int i=0; i<data.length(); i++){

            char key = data.charAt(i);

            if(!tempRoot.map.containsKey(key)){
               return 0;
            }
            tempRoot = tempRoot.map.get(key);

        }

        return tempRoot.count;

    }

    void insert(String  data, ContactTrieNode root){
        ContactTrieNode tempRoot  = root;

        for(int i=0; i<data.length(); i++){

            char key = data.charAt(i);

            if(!tempRoot.map.containsKey(key)){
                ContactTrieNode contactTrieNode = new ContactTrieNode(key);
                contactTrieNode.count = contactTrieNode.count +1;
                tempRoot.map.put(key, contactTrieNode);
            }else{
                tempRoot.map.get(key).count =  tempRoot.map.get(key).count+1;
            }

            tempRoot = tempRoot.map.get(key);

        }

        tempRoot.isEnd = true;

    }




}
