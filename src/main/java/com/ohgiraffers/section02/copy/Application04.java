package com.ohgiraffers.section02.copy;

public class Application04 {

    public static void main(String[] args) {

        /* 수업목표. 배열의 깊은 복사를 사용한 문법을 이해하고 이를 활용 할 수 있다.
            필기.
                깊은 복사는 원본과 복사본 중 둘 중 한가지 값을 변경해도 다른 하나에 영향을 주지 않는다.
         */
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1.clone();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += 10;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        for (int i  : arr2) {
            i += 10;
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }

        System.out.println();
    }

}
