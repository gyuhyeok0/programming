package com.ohgiraffers.section02.copy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application03 {

    public static void main(String[] args) {

        /*수업목표. 깊은 복사에 이해 할 수 있다.

            필기.
                깊은 복사를 하는 방법은 4가지가 있다.
                1. for 문을 이용한 동일한 인덱스 값 복사
                2. object 의 clone()을 이용한 복사
                3. System 의 arraycopy()를 이ㅛㅇ한 복사
                4. Arrays dml copyOf()를 이용한복사
                이중 순수 배열의 복사를 위해 만들어진 것은 arraycopy()
                가장 많이 사용되는 방식은 copyOf()
                clone() 은 이전 배열과 같은 배열만 만들 수 없는 특징을 갖고
                그 외 3가지 방법은 배열의 길이를 마음대로 조절 할 수 있다.
         */
        int[] originArr = new int[] {1,2,3,4,5};

        print(originArr);

        int[] copyArr1 = new int[10];

        for(int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }

        print(copyArr1);

        // 목차. object의 clone()을 이용한 복사
        int[] coppyArr2 = originArr.clone();
        print(coppyArr2);

        //목차. System의 arraycopy() 를 이용한 복사
        int[] coppyArr3 = new int[10];

        // 필기. 원본배열, 복사를 시작할 인덱스, 복사본 배열, 복사를 시작할 인덱스, 복사할 길이
        System.arraycopy(originArr, 0,coppyArr3,0,originArr.length);
        print(coppyArr3);

        // 목차. Arrays 의 copyOf()를 이용한 복사
        int[] copyArr4 = Arrays.copyOf(originArr, 7);
        // 복사한 만큼의 값은 같지만 원하는 배열의 크기를 지정 할 수 있다.
        print(copyArr4);

    }
    public static void print(int[] iarr) {

        System.out.println(iarr.hashCode());

        for(int i = 0; i < iarr.length; i ++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

}
