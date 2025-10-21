package com.pluralsight;

public class Employee {
    private String employeeID;
    private String employeeName;
    private String department;
    private double payRate;
    private double hoursWorked;


//    public double getTotalPay(){
//        double totalPay = this.payRate * this.hoursWorked;
//        return totalPay;
//    }

    private double REGULAR_HOURS = 40;
    private static final double OVERTIME_PAY_RATE = 0.15;

    private double getTotalPAy(){
        return (getRegularHours() * payRate) + (getOvertimeHours() * 1 + OVERTIME_PAY_RATE);
    }

    public double getTotalPay(){
        double regularPay = getRegularHours() * payRate;
        double overTimePay = getOvertimeHours() * OVERTIME_PAY_RATE;
        return regularPay + overTimePay;
    }

    public double getRegularHours(){
        if (hoursWorked < 40){
            return hoursWorked;
        }else{
            return REGULAR_HOURS;
        }
    }


    public double getOvertimeHours(){
        if (hoursWorked > REGULAR_HOURS){
            return hoursWorked - REGULAR_HOURS;
        }else{
            return 0;
        }
    }

//    public boolean punchIn() {
//        double time
//    }
//
//    public boolean punchOut(){
//        double time
//    }

}
