package com.company;

// Class Employee
// This class contains attributes and methods for an Employee


public class Employee {


    String  firstName = "";     // Attribute for the employees first name
    String  lastName = "";      // Attribute for the employees last name
    String  employeeNumber = "0"; // Attribute for the employee identification number
    int     employeeShift = 0;  // Attribute for the employee work shift


    // method Employee
    // Constructor with arguments:
    // Requirements: Argument types must match the data types in the constructor method
    // Results: Instantiates an object of type Employee with the attributes assigned
    // to the corresponding arguments in the constructor

    public Employee(String firstName, String lastName, String employeeNumber, int employeeShift) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.employeeShift = employeeShift;
    }


    // method getFirstName()
    // Requirements: none
    // Results: Returns the object attribute firstName as a String

    public String getFirstName() {
        return firstName;

    }
//*****************************************************************************

    // method setFirstName()
    // Requirements: Argument type must be a String
    // Results: sets the object attribute to be equal to the argument
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 //****************************************************************************


    // method getLastName()
    // Requirements: none
    // Results: Returns the object attribute lastName as a String

    public String getLastName() {
        return lastName;
    }

 //****************************************************************************


    // method setLastName()
    // Requirements: Argument type must be a String
    // Results: set the object attribute to be equal to the argument
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

 //****************************************************************************


    // method getEmployeeNumber()
    // Requirements: none
    // Results: Returns the object attribute employeeNumber as a String

    public String getEmployeeNumber() {
        return employeeNumber;
    }



 //****************************************************************************

    // method: setEmployeeNumber
    // Requirements: Argument type must be an int
    // Results: sets the object attribute to be equal to the argument

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    //****************************************************************************


    // method getEmployeeNumber()
    // Requirements: none
    // Results: Returns the object attribute employeeShift as an int

    public int getEmployeeShift() {
        return employeeShift;
    }


    //****************************************************************************

    // method: setEmployeeShift
    // Requirements: Argument type must be an int
    // Results: sets the object attribute to be equal to the argument

    public void setEmployeeShift(int employeeShift) {
        this.employeeShift = employeeShift;
    }



    // method: printEmployee
    // Requirements: None
    // Results: Prints out the employee information contained in the object.

    public void printEmployee(){

        System.out.print(this.getFirstName()+ "\t");
        System.out.print(this.getLastName() + "\t\t");
        System.out.print(this.getEmployeeNumber() + "\t");
        System.out.println(this.getEmployeeShift());
    }


}


