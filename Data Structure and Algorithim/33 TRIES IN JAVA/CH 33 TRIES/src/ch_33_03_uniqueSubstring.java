public class ch_33_03_uniqueSubstring {
    public static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq=1;
        public Node(){
            for(int i=0;i<children.length;i++){
                children[i] = null;
            }

        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int ind = word.charAt(i)-'a';
            if(curr.children[ind ]== null){
                curr.children[ind] = new Node();
            }
            else{
                curr.children[ind].freq++;
            }
            curr = curr.children[ind];
        }
        curr.eow = true;
    }

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int count =0;
        for(int i=0;i<26;i++){
            if(root.children[i] !=null){
                count+= countNodes(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
    String str = "ababa";

//        SUFFIX-->>INSERT INOT TRIES
        for(int i=0;i<str.length();i++){
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));
    }
}
