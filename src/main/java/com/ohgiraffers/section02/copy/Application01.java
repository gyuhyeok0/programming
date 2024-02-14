package com.ohgiraffers.section02.copy;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다.
            필기.
                얕은 복사 = stack 에 주소값만 복사
                깊은 복사 = heap 의 배열에 저장 된 값을 복사 (실제 값을 복사)
         */
        int[] originArr = {1,2,3,4,5};

        int[] copyArr = originArr; // 얕은 복사

//        System.out.println(originArr.hashCode());
//        System.out.println(copyArr.hashCode());

        for (int i = 0; i < originArr.length; i ++) {
            System.out.println(originArr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < originArr.length; i ++) {
            System.out.println(copyArr[i] + " ");
        }



    }

}
