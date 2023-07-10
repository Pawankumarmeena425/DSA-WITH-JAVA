public class ch_33_04_longet_word {
    public static class Node{
        Node children[]=  new Node[26];
        boolean eow = false;
        public Node(){
            for (int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int ind = word.charAt(i)-'a';
            if(curr.children[ind] ==null){
                curr.children[ind] = new Node();
            }
            curr = curr.children[ind];
        }
        curr.eow = true;
    }
    public static String ans = "";
    public static void longestWord(Node root, StringBuilder temp){
        if(root==null){
            return ;
        }
        for(int i=0;i<26;i++){
            if(root.children[i] !=null && root.children[i].eow==true){
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length()>ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i] , temp);

//                Backtracking steps
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        String words[] = {"a","banana","app","appl","ap","apply","apple"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        longestWord(root,new StringBuilder(""));
        System.out.println(ans);
    }
}
