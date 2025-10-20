package com.pluralsight;

public class Employee {
    private String employeeID;
    private String employeeName;
    private String department;
    private double payRate;
    private int hoursWorked;

    public Employee(String employeeID, String employeeName, String department, double payRate, int hoursWorked) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay(){
        double total = getHoursWorked() * getHoursWorked();

    }
}
