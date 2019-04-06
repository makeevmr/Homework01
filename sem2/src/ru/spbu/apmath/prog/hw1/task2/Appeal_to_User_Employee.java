package ru.spbu.apmath.prog.hw1.task2;

import java.util.Scanner;

public class Appeal_to_User_Employee {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество сотрудников: ");
        int workers_numb = scan.nextInt();
        String[] Matrix = Employee.getSalary(workers_numb);
        for(int i = 0;i<=workers_numb-1;i++){
            System.out.println(Matrix[i]);

        }

    }



}
