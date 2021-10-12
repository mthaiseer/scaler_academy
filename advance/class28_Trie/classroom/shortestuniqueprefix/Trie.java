package advance.class28_Trie.classroom.shortestuniqueprefix;


public class Trie {

    TrieNode root = new TrieNode('\0');


    String  search(String  data){
        TrieNode tempRoot  = root;
        int count = 0;
        StringBuffer buffer = new StringBuffer();

        for(int i=0; i<data.length(); i++){

            char key = data.charAt(i);

            if(!tempRoot.map.containsKey(key) ){
                return buffer.toString();
            }

            if(tempRoot.map.get(key).count == 1){
                buffer.append(key);
                return  buffer.toString();
            }else{
                buffer.append(key);
            }



            tempRoot = tempRoot.map.get(key);

        }

        return  buffer.toString();

    }

    void insert(String  data){
        TrieNode tempRoot  = root;

        for(int i=0; i<data.length(); i++){

            char key = data.charAt(i);

            if(!tempRoot.map.containsKey(key)){
                TrieNode contactTrieNode = new TrieNode(key);
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
