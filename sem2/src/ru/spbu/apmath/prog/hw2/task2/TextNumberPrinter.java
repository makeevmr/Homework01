package ru.spbu.apmath.prog.hw2.task2;

public class TextNumberPrinter {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            char[] chnumer = NumberTranslator.translate(i).toCharArray();
            sum += chnumer.length;
        }
        System.out.println(sum);
    }
}
