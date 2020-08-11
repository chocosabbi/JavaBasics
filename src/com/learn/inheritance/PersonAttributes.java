package com.learn.inheritance;

public class PersonAttributes {

    public static void main(String[] args) {
        Person james = new Person();
        Person oliver = new Person("Bond", "Oliver", 48);
        System.out.println(oliver.getAge());

        Employee employee = new Employee();
        employee.setId(892734);
        employee.setFirstName("Allie");
        employee.setLastName("Jones");
        employee.setAge(34);
        employee.setAnnualSalary(100000);
        //inherits methods from Person even though the Employee class is empty
        //will return 0
        System.out.println("ID " + employee.getId() + ": " +
                employee.getFirstName() + " " +
                employee.getLastName() + " " +
                "is " + employee.getAge() + " " +
                "gets paid " + employee.getAnnualSalary());

        //will retrieve methods from Person and Employee
        //the Manager class extends Employee which extends from PErson
        Manager manager = new Manager();
        manager.setId(219873);
        manager.setFirstName("Harris");
        manager.setLastName("Bass");
        manager.setAge(25);
        manager.setAnnualSalary(150000);
        System.out.println("ID " + manager.getId() + ": " +
                manager.getFirstName() + " " +
                manager.getLastName() + " " +
                "is " + manager.getAge() + " " +
                "gets paid " + manager.getAnnualSalary());

        //only shows the memory space number without a toString
        //but now when the toString is inserted
        //it will show the attributes of the manager
        System.out.println(manager);

        //Understanding String as a class
        //int is only a primitive
        int a = 12;
        //String belongs to a class, therefore is not a primitive
        String myString = "Hello";
        //creating an empty string
        boolean isEmpty = myString.isEmpty();

        if (!isEmpty) {
            System.out.println(myString);
        } else {
            System.out.println("Empty");
        }

        //string is no longer empty
        boolean contains = myString.contains("");

        if (!contains) {
            System.out.println("Yes contains h");
        } else {
            System.out.println("No h is in the string");
        }

        //chatAt returns the character in a sentence
        // that is called by its placement as a number
        String anotherString = "Hello";
        char ch3 = anotherString.charAt(3);
        System.out.println(ch3);

        String str = new String("28/12/2013");

        System.out.println("split(String regex):");
        /* Here we are using first variation of java string split method
         * which splits the string into substring based on the regular
         * expression, there is no limit on the substrings
         */
        String array1[]= str.split("/");
        for (String temp: array1){
            System.out.println(temp);
        }

    }
}
