package com.ohgiraffers.section01.array;

public class Application3 {

    public static void main(String[] args) {

        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumber = {"2","3","4","5","6","JOKER","Queen","King","AGE"};

        int randomShapeIndex = (int)(Math.random() * shapes.length);
        int randomCardNumberIndex = (int)(Math.random() * cardNumber.length);

        System.out.println(shapes[randomShapeIndex]);
        System.out.println(cardNumber[randomCardNumberIndex]);

    }

}
