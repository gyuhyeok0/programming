package com.ohgiraffers.section01.array;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 배열에 대해 이해하고 배열의 사용 목적을 이해 할 수 있다.
            필기.
                배열이란 동일한 자료형의 묶음( 연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도) 이다.
                배열은 heap 영역에 new 연산자를 이용하여 할당한다.
         */
        /* 필기.
            배열의 사용 이유
            만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.
            1. 연속된 메모리 공간으로 관리할 수 없다.
            2. 반복문을 이용한 연속 처리가 불가능하다.
         */

        /* 목차. 배열의 선언 및 할당 */
        int[] arr = new int[5];

        arr[0] = 10;
        System.out.println(arr[2]);

        /* 필기.
            배열의 사용 방법
            1. 배열의 선언
            2. 배열의 할당
            3. 배열의 인덱스 값 대입
         */
        

        // 필기. 선언은 stack 에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다.

        int[] num;
        num = new int[5];
        // 필기. 선언한 레러런스변수에 배열을 할당하여 대입 할 수 있다. new 연산자는 heap에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
        // 필기. 참고자료형(referenc type) 이라고 한다.

        int[] iarr;
        iarr = new int[3];

        /* 필기.
            값의 형태 별 기본값
            정수:0
            실수: 0.0
            논리: false
            문자: 유니코드
            참조: null
         */

        /* 필기. 자바에서 지정한 기본값 외의 값으로 초기화 하고 싶으면 블럭({}) 을 이용한다.
            블럭({})을 사용하는 경우에는 new 를 사용하지 않아도 되며, 값의 갯수만큼 자동으로
            크기가 설정된다.
         */
        int[] iarr3 = new int[5];
        iarr3[0] = 10;
        iarr3[1] = 10;
        iarr3[2] = 10;
        iarr3[3] = 10;
        iarr3[4] = 10;

        int[] iarr4 = {10,20,30,40,50};
        int[] iarr5 = new int[] {1,2,3,4,5,6};

        System.out.println("iarr4의 길이 : " + iarr4.length);
        System.out.println(iarr5.length);

        for(int i =0; i < iarr5.length; i++) {
            System.out.println("iarr5[" + i + "]" + iarr5[i]);
        }
        //문자열 배열을 만들어보자
        String[] sarr = {"apple", "banana","grape","orange"};
        for(int i = 0; i < sarr.length; i++){
            System.out.println("sarr[" + i + " = " + " = " + sarr[i]);
        }
    }


}
