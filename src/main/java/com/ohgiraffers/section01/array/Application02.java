package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {

        int[] iarr= new int[5];
        char[] carr = new char[10];

        System.out.println(iarr);
        System.out.println(carr);

        /* 필기.
            hashcode() : 주소값을 10진수로 변환하여 객채의 고유한 정수값을 반환
            동일한 객체인지 비교할때 사용
         */

        System.out.println(iarr.hashCode());
        System.out.println(carr.hashCode());

        // 스캐너 사용
        Scanner sc = new Scanner(System.in);

        System.out.print("새로 할당할 배열의 길이를 입력하세요 : ");
        int size = sc.nextInt();

        int[] iarr2 = new int[size];

        System.out.println("iarr2의 hashcode : " + iarr2.hashCode());
        System.out.println("iarr2의 길이 : " + iarr2.length);

        //필기. 하지만 한 번 지정한 배열의 크기는 변경하지 못한다.

        iarr2= new int[20];
        System.out.println("iarr2의 hashcode : " + iarr2.hashCode());
        System.out.println("iarr2의 길이 : " + iarr2.length);

        iarr2= new int[20];
        iarr2= new int[20];



    }

}
