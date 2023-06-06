public class ch_33_word_break
{
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;//end Of Word
        Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();// root node

    public static void insert(String word){ //Time Complexity - O(L)
        Node curr = root;
        for(int level = 0;level<word.length();level++){
            int ind = word.charAt(level)-'a';
            if(curr.children[ind] == null){
                curr.children[ind] = new Node();
            }
            curr = curr.children[ind];
        }
        curr.eow = true;
    }
    public static boolean search(String key){ //Time Complexity - O(L)
        Node curr = root;
        for(int level = 0;level<key.length();level++){
            int ind = key.charAt(level)-'a';
            if(curr.children[ind] == null){
                return false;
            }
            curr = curr.children[ind];
        }
       return curr.eow == true;
    }

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
//            substring not include last index , so start with i=1
            if(search(key.substring(0,i)) &&
                wordBreak(key.substring(i))){
                    return true;

            }
        }
        return false;
    }
    public static boolean startWith(String prefix){
        Node curr = root;
        for(int i=0;i<prefix.length();i++){
            int ind = prefix.charAt(i)-'a';
            if(curr.children[ind]==null){
                return false;
            }
            curr = curr.children[ind];
        }
        return true;
    }
    public static void main(String[] args) {
//        String words[] = {"the" , "a" , "there" , "their" , "any" , "thee"};
//        for(int i=0;i<words.length;i++){
//            insert(words[i]);
//        }
//        System.out.println(search("thee"));
//        System.out.println(search("thro"));


//        ****** Word Break Problem ***********
//        String arr[] = {"i" , "like" , "sam" ,"samsung" , "mobile" ,"ice"};
        String arr[] = {"aaaa","aa"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }

        String key = "aaaaaaa";
        System.out.println(wordBreak(key));

        String prefix[] = {"apple","app","mango","man","woman"};
        for (int i=0;i<prefix.length;i++){
            insert(prefix[i]);
        }
        System.out.println(startWith("app"));

    }
}
