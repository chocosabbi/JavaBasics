package com.learn;

public class LogicalOperators {

    public static void main(String[] args) {

        /*
        Logical Operators
        AND --> && - returns false if one is false
        OR  --> || - returns the opposite of AND
        Negation  --> != - not equal to
         */
        double firstAge = 21;
        double secondAge = 17;
        boolean isAged = true;
        boolean isNotAged = false;
        boolean isAlsoAged = true;

        // first age has to be larger than 21 therefore will return false
        if (firstAge > 21) {
            System.out.println("Can consume alcohol");
        } else {
            System.out.println("Cannot consume alcohol");
        }
        //secondAge will return true because int is lower than 21
        if (secondAge < 21) {
            System.out.println("Can consume alcohol");
        } else {
            System.out.println("Cannot consume alcohol");
        }
        // both is Aged and isNotAged are not the same so therefore will return false
        if (isAged && isNotAged) {
            System.out.println("Can consume beer");
        } else {
            System.out.println("Cannot consume beer");
        }
        //both are aged so will return true
        if (isAged && isAlsoAged) {
            System.out.println("Can consume alcohol");
        } else {
            System.out.println("cannot consume alcohol");
        }
        // the and operator won't allow a not aged person to return true
        if (!isAged && isAlsoAged) {
            System.out.println("Can consume alcohol");
        } else {
            System.out.println("cannot consume alcohol");
        }
        //one of the persons is isAged or isNotAged and the firstage is larger than 12
        //it will return true
        if ((isAged || isNotAged) && (firstAge > 12)) {
            System.out.println("Can consume alcohol");
        } else {
            System.out.println("cannot consume alcohol");
        }
    }
}
