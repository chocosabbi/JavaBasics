package com.learn;

public class ForLoops {

    public static void main(String[] args) {
        //without loops we get a ton of redundant code
        //System.out.println("Hello there");
        //System.out.println("Hello there");
        //System.out.println("Hello there");
        //System.out.println("Hello there");
        //System.out.println("Hello there");

        //to solve this problem we create a for loop
        //instantiate a variable to run many times over
        //the i will increment by 1 each time
        //the loop will read over the code for a number of times requested
        //and stops when it reaches the desired number
        for (int i = 0; i < 10; i++) {
            //will run this code at the end
            System.out.println("Hello there");
        }
        for (int i = 0; i < 10; i++) {
            //will run this code at the end
            //this time will show the incremented number
            System.out.println("Hello there " + i);
        }
        for (int i = 0; i < 10; i++) {
            //will run this code at the end
            //this time we will show the multiples of 2
            if (i % 2 == 0) {
                System.out.println(i +" is a multiple of 2");
            }
        }
    }

}
