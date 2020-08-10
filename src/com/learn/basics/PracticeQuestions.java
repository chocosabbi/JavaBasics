package com.learn.basics;

public class PracticeQuestions {

    /*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation.
Return true if we sleep in.
 */
    private static boolean sleepIn(boolean weekday, boolean vacation) {
        //boolean weekday = true;
        //boolean vacation = true;
        if (!weekday || vacation) {
            System.out.println("true");
            return true;
        } return false;
    }

    public static void main(String[] args) {
        sleepIn(false, true);
    }

}