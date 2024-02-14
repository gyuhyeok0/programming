package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application04 {

    /* 필기. 배열의 예시
        5명의 자바 점수를 정수로 입력 받아 합계와 평균을 실수로 구하는 프로그램 만들기
     */
        public static void main(String[] args) {

        int[] scores = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < scores.length; i++) {

            System.out.println((i+1) + "번 째 학생의 자바 점수를 입력해주세요 : ");
            scores[i] = sc.nextInt();
        }
        int sum3;
        double sum = 0.0;
        double avg = 0.0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
            System.out.println(sum);
        avg = sum/ scores.length;
            System.out.println(avg);
            System.out.println(avg);
            System.out.println(avg);
    }

}
