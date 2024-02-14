package com.ohgiraffers.section02.copy;

public class Application02 {

    public static void main(String[] args) {

        /* 필기.
            얇은 복사를 활용 - 메소드 호출 인자로 사용하는 경우와 리턴값으로 동일한 배열을 리턴 해주고 싶은 경우
         */

        String[] names = {"조평훈", "이순신", "홍길동"};

        System.out.println(names.hashCode());

        print(names);

        /* 필기. 리턴값으로 활용 */
        String[] animals = getAnimals();

        System.out.println(animals.hashCode());

        print(animals);

    }

    public static void print(String[] sarr){

        // 필기. 전달 받은 배열의 hashCode 출력
        System.out.println("sarr의 hashCode :" + sarr.hashCode());

        // 필기. 전달 받은 배열의 값 출력
        for(int i = 0; i < sarr.length; i++ ) {

            System.out.println(sarr[i]);

        }
        System.out.println();


    }

    public static String[] getAnimals() {

        String[] animals = new String[] { "낙타", "호랑이", "나무늘보"};
        System.out.println(animals.hashCode());
        return animals;
    }

}
