package ru.spbu.apmath.prog.hw2.task1;

import java.util.Scanner;

public class SummarizedDiscounts {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение ложной скидки: ");
        int falsediscount = scan.nextInt();
        System.out.println("Настоящая скидка: " + DiscountsLogic.discountCalc(falsediscount));
    }
}
