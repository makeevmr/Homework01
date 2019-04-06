package ru.spbu.apmath.prog.hw1.task1;

import java.util.Scanner;

public class User_intaraction_toBinary{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение числа: ");
        int value = scan.nextInt();
        System.out.println(Translation_toBinary.toBinary(value));

    }
}

