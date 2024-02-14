package com.ohgiraffers.section03.sort;

public class Test {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        System.out.println("original의 해시코드: " + original.hashCode());



        print(original);

    }

    

    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println();
    }

}
