
package com.company;
import java .util.*;
public class leetcode {
   static class  Tasksedular implements Comparable<Tasksedular>{
        char ch;
        int fre;
        Tasksedular(char ch, int fre){
            this.ch = ch;
            this.fre = fre;
        }
        public int compareTo(Tasksedular obj){
            return obj.fre-this.fre;
            // Decending order sorting
        }
    }
    public  static int leastInterval(char[] tasks, int n) {
        //put all character in the map and count frequency of each character
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
// put all the values in the priority queue and sort base on decending order
        PriorityQueue<Tasksedular> pq = new PriorityQueue<>();
        Set<Character>key = map.keySet();
        for(Character c:key){
            pq.add(new Tasksedular(c,map.get(c)));
        }
        ArrayList<Character> chlist= new ArrayList<>();
        ArrayList<Integer> list  = new ArrayList<>();
        int count=0;
        while(!pq.isEmpty()){
            int i=0;
            boolean b = false;
            char ch = pq.peek().ch;
            int fre = pq.peek().fre;
            pq.remove();
            chlist.add(ch);
            list.add(fre-1);
            while(i<n){
                if(pq.isEmpty()){
                    b = true;
                    break;
                }
                ch = pq.peek().ch;
                fre = pq.peek().fre;
                pq.remove();
                chlist.add(ch);
                list.add(fre-1);
                i++;
            }
            boolean  check  = true;
            if(list.size()<=n){
                //  check all are euqal to 0

                for(int k=0;k<list.size();k++){
                    if(list.get(k)!=0){
                        check = false;
                        break;
                    }
                }
            }
            if(check){
                count =count+list.size();

            }
            else{
                count = count+n+1;
            }

// again put values in the pq
            for(int j=0;j<list.size();j++){
                if(list.get(j)!=0){
                    pq.add(new Tasksedular(chlist.get(j),list.get(j)));
                }

            }
            list.clear();
            chlist.clear();
        }

        return count;
    }
    public static void main(String[] args) {
char tasks []= {'A','A','A','B','B','B'};
        System.out.println(leastInterval(tasks,2));
    }
}
