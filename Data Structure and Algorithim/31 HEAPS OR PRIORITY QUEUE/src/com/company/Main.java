package com.company;
import java.util.Comparator;
import java .util.PriorityQueue;
public class Main {
static class Student implements Comparable<Student> {
    String name;
    int rank;
    Student(int rank,String name){
        this.name = name;
        this.rank = rank;
    }

@Override
    public int compareTo(Student s2){
        return this.rank-s2.rank;
}
}
    public static void main(String[] args) {
	// write your code here
        PriorityQueue<Integer>pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(5);
        pq.add(3);
        pq.add(9);
        pq.add(2);
        pq.add(1);
        pq.add(6);
        while (!pq.isEmpty()){
            System.out.println(pq.peek());;
            pq.remove();
        }
        //Priority Queue for objects
PriorityQueue<Student> ps = new PriorityQueue<>(Comparator.reverseOrder());
        ps.add(new Student(3,"A"));
        ps.add(new Student(5,"F"));
        ps.add(new Student(2,"S"));
        ps.add(new Student(7,"M"));
        ps.add(new Student(1,"C"));
        ps.add(new Student(2,"D"));
        while(!ps.isEmpty()){
            System.out.println(ps.peek().name +"--->>"+ps.peek().rank);
            ps.remove();
        }
    }
}
