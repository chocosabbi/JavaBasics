package com.learn;

public class NumericalOperations {

    public static void main(String[] args) {

        int a = 12;
        int b = 12;

        int total = b + a;
        int totalMinus = b - a;
        int totalMultiply = b * a;
        int totalDivide = b / a;

        //variables printed with basic operations add, subtract, multiply, divide.
        System.out.println(total);
        System.out.println(totalMinus);
        System.out.println(totalMultiply);
        System.out.println(totalDivide);

        //basic addition and subtraction
        System.out.println(9 + total);
        System.out.println(9 - total);
        //multiplication and division


        //strings will not be calculated
        //will print as 924
        System.out.println("9" + total);

        //using remainders  % == "what remains..."
        //we divide a by b and it shows 0 as the remainder
        double remainder = a%b;
        System.out.println("remainder is " + remainder);

        double c = 15;
        double d = 4;
        double secRemainder = c%d;
        System.out.println("remainder is " + secRemainder);

    }
}
