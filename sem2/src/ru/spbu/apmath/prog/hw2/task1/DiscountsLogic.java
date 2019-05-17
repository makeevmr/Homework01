package ru.spbu.apmath.prog.hw2.task1;

public class DiscountsLogic {
    public static int discountCalc(int falsediscount) {
        int discount = falsediscount;

        if (discount == discount % 10) {
            return discount;
        } else {
            int sum = 0;
            while (discount > 0) {
                sum += discount % 10;
                discount = (int) Math.floor(discount / 10);
            }
            discount = sum;
            return discountCalc(discount);
        }
    }
}
