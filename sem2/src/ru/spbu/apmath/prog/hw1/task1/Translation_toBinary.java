package ru.spbu.apmath.prog.hw1.task1;

public class Translation_toBinary {
    public static String toBinary(int value) {
        if(value < 0){
            throw new IllegalArgumentException("Введите неотрицательное значение");
        }
        String out_value = new String();
        if(value == 0){
            return "0 ";
        }
        while (value > 1) {
            if (value % 2 == 1) {
                out_value = '1' + out_value;
            }else{
                out_value = '0' + out_value;
            }
            value = value/2;
        }
        if(value == 1){
            out_value = '1' + out_value;
        }

        return out_value;
    }
}