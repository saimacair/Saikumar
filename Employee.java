package demo;

import demo.Employee;

public class Employee {
//private variables which can be accessed by public methods of the class
private String EmpName = "Sai";
private int EmpID = 4665704;
private double EmpSal = 21500.56;
// get method to access the private integer variable EmpSal
public double getEmpSal()
{return EmpSal;
}// get method to access the private string variable EmpName
public String getEmpName()
{
return EmpName;
}
// get method to access the private integer variable EmpID
public int getEmpID()
{
return EmpID;
}




public class EmployeeEncaps {
public static void main(String[] args) {
Employee EmpObj= new Employee(); //object of the class Employee
// Printing values of the variables
System.out.println("Employee's Name: " + EmpObj.getEmpName());
System.out.println("Employee's ID: " + EmpObj.getEmpID());
System.out.println("Employee's Salary: " + EmpObj.getEmpSal());
}
}
}