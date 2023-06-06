package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class ch35_01_HashMapCodeImplementation {
    static class HashMap<K, V> { // generic (we don't know the type of the key and value , so make generic that why it will run for all type)
        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n calculate size of the linkedlist (nomber of nodes)
        private int N;
        private LinkedList<Node> buckets[]; // N = buckets.length  Size of the buckets array

        @SuppressWarnings("unchecked")
        public HashMap() {

            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            // value may be positive or negative so take modulo with size then it will give valid index
            return Math.abs(hc) % N;
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }
@SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
//nodes   -->> add in bucket
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }

        }

        public void put(K key, V value) {
            int bi = hashFunction(key);// buckets index -->> 0 to 3
            int di = SearchInLL(key, bi);// if node exit then give valid data index otherwise give -1

            if (di != -1) {// node exist

                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if(di!=-1){ // valid index
                return true;
            }
            else {
                return false;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if(di!=-1){ // valid index
               Node node = buckets[bi].get(di);
               n--;
               return node.value;
            }
            else {
                return null;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if(di!=-1){
                Node node = buckets[bi].remove(di);
                return node.value;
            }
            else{
                return null;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K>keys  = new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll  = buckets[i];
                for(Node node:ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
    }
        public static void main(String[] args) {
HashMap<String,Integer>hm = new HashMap<>();
hm.put("India",24);;
hm.put("China",123);;
hm.put("us",2);
hm.put("Nepal",650);;
ArrayList<String> keys = hm.keySet();
for(String k: keys){
    System.out.println(k);
}
            System.out.println(hm.get("India"));
            System.out.println(hm.remove("India"));
            System.out.println(hm.remove("India"));
        }
    }

