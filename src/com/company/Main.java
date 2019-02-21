// You are going to create an employee class that accepts Employee Name, Employee Number, and Employee
// shift as parameters. (Shift will be an int: 1, 2, or 3)
// You will need to add public getter and setter options and create a constructor. (Automatic generation available in IntelliJ)
// You will need to add a public method for displaying well-formatted employee information.
// Then you will create a program that calls the class and instantiates the class with information for three employees
// (Just provide the information, you don't have to get it from the user.)


package com.company;

public class Main {

    public static void main(String[] args) {


        // create three objects of type Employee by calling the constructor of the Employee class

        Employee emp1 = new Employee("Ellen", "Ripley", "A1234", 2);
        Employee emp2 = new Employee("Sarah", "Connor", "A3141", 3);
        Employee emp3 = new Employee("Eldon", "Tyrell", "B4437", 1);

        // write your code here
        System.out.println("Name \t" + "Last Name \t" + "Number \t" + "Shift");
        emp1.printEmployee();
        emp2.printEmployee();
        emp3.printEmployee();

    }
}
