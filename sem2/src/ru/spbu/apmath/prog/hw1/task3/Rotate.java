package ru.spbu.apmath.prog.hw1.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Rotate {
    public static ArrayList rotate(int length) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan1 = new Scanner(System.in);
        for (int i = 0; i <= length - 1; i++) {
            int value = scan1.nextInt();
            list.add(value);
            // list = scan1.nextInt()
        }
        ArrayList<Integer> rotate_list = new ArrayList<>();
        System.out.println("Введите сдвиг: ");
        int shift = scan1.nextInt();
        if(shift == 0){
            return list;
        }
        if(shift>0){
            for(int i = length - shift; i<=length-1 ; i++){
                rotate_list.add(list.get(i));
            }
            for(int i = 0;i<length - shift; i++){
                rotate_list.add(list.get(i));
            }
        }
        if(shift<0){
            for(int i = -shift; i<=length-1;i++){
                rotate_list.add(list.get(i));
            }
            for(int i = 0;i<-shift;i++){
                rotate_list.add(list.get(i));
            }
        }
        return rotate_list;
    }
}