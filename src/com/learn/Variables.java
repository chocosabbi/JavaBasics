package com.learn;

public class Variables {

    public static void main(String[] args) {
        //variable is a bucket in the memory
        String name = "Saba";
        //int bucket has a size limit
        int age = 23;
        //an int will have to fit the capacity it allows
        int capacityOfInt = 239090909;
        //long has a higher memory capacity than int
        long capcityOfLong = 949909090;
        //floats and doubles use decimal numbers
        //floats have a small memory capacity
        float pi = 31.14f;
        //double has a higher memory capacity than a float
        //not always necessary to create the variable as 3.14d
        double pid = 51.14;

        //example of String
        System.out.println(name);

        //example of int and long
        System.out.println(age);
        System.out.println("The capacity of an int is "+ capacityOfInt);
        System.out.println("The capacity of a long is " + capcityOfLong);

        //examples of concatenation
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My name is " + name + " and I'm " + age + " years old");


        //examples of float and double
        System.out.println("My bank balance is £" + pi);
        System.out.println("My bank balance is £" + pid);


    }
}
