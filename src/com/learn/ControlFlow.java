package com.learn;

public class ControlFlow {

    public static void main(String[] args) {

        double a = 13;
        double b = 11;
        boolean isAged = true;

        //if statements
        /*
        -- Relational Operators --
        =  --> assigning variables etc.
        == --> comparison
        != --> not equal to
        !  --> negation
        >  --> greater than
        <  --> less than
        >= --> greater than or equal to
        <= --> less than or equal to

         */

        //if a is equal to b then we run a piece of code
        if (a == b ) {
            System.out.println("Indeed!");
        } else {
            System.out.println("Not true");
        }
        //if a is not equal to b then we run a piece of code
        if (a != b ) {
            System.out.println("Indeed!");
        } else {
            System.out.println("Not true");
        }
        //if isAged isn't true then run this piece of code
        if (!isAged) {
            System.out.println("Indeed");
        } else {
            System.out.println("Not True");
        }
        if (a > b) {
            System.out.println("Indeed");
        } else {
            System.out.println("Not True");
        }
        if (a < b) {
            System.out.println("Indeed");
        } else {
            System.out.println("Not True");
        }
        if (a >= b) {
            System.out.println("Indeed");
        } else {
            System.out.println("Not True");
        }
        if (a <= b) {
            System.out.println("Indeed");
        } else {
            System.out.println("Not True");
        }

    }
}
