package com.concordia.a2.config;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Test implements Comparable {
    String name;
    int age;

    public Test(int age,String name){
       this.age = age;
       this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private static void change(int[] arr){
        int[] good = {9,8,7,6,5,4,3,2,1};
        arr = good;
       // for(int x: arr) System.out.println(x +"inner");
    }

    public static void main(String[] args) {
       Test t = new Test(20,"zhong");
        int[] arr = {1,2,3,4,5,6,12,-9,6};// Integer implement comparable-->define a rule to compare
        Test test1 = new Test(54,"laode");
        Test test2 = new Test(18,"xiaode");
        Test[] arr1 = {test1,test2,t};
        Arrays.sort(arr1);
        Arrays.sort(arr);
        //change(arr);
        PriorityQueue<Test> pq = new PriorityQueue<>(
                (q1,q2) -> q1.age - q2.age
        );

        for(Test x: arr1) System.out.println(x);
    }

    @Override
    public int compareTo(Object o) {
        Test t = (Test) o;
        return this.age - t.age;
    }
}
