package com.company;

public class ch22_00_PracticeQuestion {
    public static int uniqueMorseRepresentations(String[] words) {
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

//Change words String array in the encoding form
for(int i=0;i< words.length;i++){
String wordpart = words[i];
    System.out.print(wordpart+" :");
char ch[]=wordpart.toCharArray();
//clear wordpart
    wordpart="";
for(int j=0;j<ch.length;j++){
    int index = ch[j]-'a';
    wordpart=wordpart+arr[index];
}
//Again reinitilize encoding string in the original string array
    words[i]=wordpart;
    System.out.println(words[i]);
}
int count=0;
for (int i=0;i< words.length;i++){
    if(words[i]==""){
        continue;
    }
   for(int j=0;j< words.length;j++){
//       Don't use == it will not compare right
       if(words[i].equals(words[j])&&i!=j){
           words[j]="";
       }
   }
    printString(words);
   count++;
}
return count;
    }
    public static void printString(String words[]){
        for(int i=0;i<words.length;i++){
            System.out.print(words[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String words[] =  {"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(words)); ;
    }
}
