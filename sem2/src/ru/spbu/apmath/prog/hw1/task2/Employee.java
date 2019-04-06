package ru.spbu.apmath.prog.hw1.task2;

import java.util.Scanner;

public class Employee {
    public static String[] getSalary(int workers_numb){
        double salary;
        /*
        Employee(String n, double s,int h) {
            Name = n;
            salary_hour = s;
            hours = h;
        }
        */
        String[] workers = new String[workers_numb];

        for(int i = 0; i<= workers_numb-1; i++){
            Scanner scan1 = new Scanner(System.in);
            String Name = scan1.nextLine();
            double salary_hour =scan1.nextDouble();
            int hours = scan1.nextInt();


            if(hours>40){
                salary = (hours-40)*1.5*salary_hour + 40*salary_hour;
            }else{
                salary = hours*salary_hour;
            }
        workers[i] = Name + ' ' + String.valueOf(salary_hour) + ' ' + String.valueOf(salary);
        }
    return workers;
    }

}