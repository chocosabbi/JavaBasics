package com.learn;

public class LearningMethods {

    public static void main(String[] args) {
        showName();
        anotherMethod("is running", 23);
        addNumbers(21, 25);
        multiplyNumbers(2, 4);
        //alternative way to return a method
        int finalResult = returnAddNumbers(23, 23);
        System.out.println(finalResult);
        System.out.println(fullName("Adam", "Eve"));
    }

    public static void showName() {
        System.out.println("From showName");
    }

    //passing a parameter in a method
    public static void anotherMethod(String something, int age) {
        System.out.println("another method " + something + "\n" + age);
        if (age < 90) {
            System.out.println("I am still young");
        } else {
            System.out.println("I am very old now");
        }
    }

    public static void addNumbers(int a, int b) {
        System.out.println("Lets do addition on " + a + " + " + b);
        int sum = a + b;
        System.out.println("The sum is " + sum);
    }

    //showing a different way to add numbers
    public static int returnAddNumbers(int a, int b) {
        int result;
        result = a + b;
        return result;
    }

    public static void multiplyNumbers(int a, int b) {
        System.out.println("Let's do some multiplication on " + a + " + " + b);
        int sum = a * b;
        System.out.println("The sum is " + sum);
    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
