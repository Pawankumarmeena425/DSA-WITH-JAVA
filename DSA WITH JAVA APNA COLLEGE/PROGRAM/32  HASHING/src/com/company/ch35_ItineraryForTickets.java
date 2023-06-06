package com.company;
import java.util.*;
public class ch35_ItineraryForTickets {
    public static String getStart(   HashMap<String,String> map){
        HashMap<String,String>revmap = new HashMap<>();

        for (String key:map.keySet()
             ) {
            revmap.put(map.get(key),key);//end to start map
        }
        for (String key :
                map.keySet()) {
            if(!revmap.containsKey(key)){
                return key;
            }

        }
        return null;

    }
    public static void main(String[] args) {
        String tickets[][] ={{"Chennai","Bengaluru"},{"Mumbai","Delhi"},{"Goa","Chennai"},{"Delhi","Goa"}};
        HashMap<String,String> map = new HashMap<>();

        for(int i=0;i<tickets.length;i++){
            map.put(tickets[i][0],tickets[i][1]); // from to to
        }
String start = getStart(map);

        System.out.print(start);
        while(!map.isEmpty()){
            System.out.print("-->>"+map.get(start));
            String prestart  = start;
            start = map.get(start);
            map.remove(prestart);
        }

    }
}
