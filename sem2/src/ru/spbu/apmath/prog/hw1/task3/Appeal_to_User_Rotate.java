package ru.spbu.apmath.prog.hw1.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Appeal_to_User_Rotate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину списка: ");
        int length = scan.nextInt();
        ArrayList<Integer> final_list = new ArrayList<>();
        final_list = Rotate.rotate(length);
        System.out.println(final_list);
    }
}

