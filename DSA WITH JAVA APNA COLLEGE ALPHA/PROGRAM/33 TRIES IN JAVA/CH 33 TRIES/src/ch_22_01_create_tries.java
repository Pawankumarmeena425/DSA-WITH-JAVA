public class ch_22_01_create_tries {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=  null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for (int level = 0;level<word.length();level++){
            int ind = word.charAt(level)-'a';
            if(curr.children[ind] == null){
                curr.children[ind] = new Node();
            }
            curr = curr.children[ind];
        }
        curr.eow = true;
    }
    public static boolean search(String key){
        Node curr = root;
        for(int level =0;level<key.length();level++){
            int ind = key.charAt(level)-'a';
            if(curr.children[ind] == null){
                return false;
            }
            curr = curr.children[ind];
        }
      return curr.eow;
    }
    public static void main(String[] args) {
        String words[] = {"the" ,"a" ,"there" , "their" , "any" , "thee"};

        for (int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search("the"));
    }
}
