package com.cheekin;

import java.util.Scanner;

public class Car {
    //scanner input
    Scanner s = new Scanner(System.in);
    private double price,downPayment;
    private int interestRate;
    private int period;
    private int month;


    //Constructor
    Car(double RCL, int P){
        System.out.print("Please Enter Price of Car(RM): ");
        this.price = s.nextInt();
        System.out.print("Please Enter Down Payment(RM): ");
        this.downPayment = s.nextDouble();
        System.out.print("Please Enter Interest Rate(%): ");
        this.interestRate = s.nextInt();
        System.out.print("Please Enter Period(Years): ");
        this.period = s.nextInt();

    }


    //Getter method
    public double getPrice() {
        return this.price;
    }

    public double getDownPayment() {
        return this.downPayment;
    }

    public int getInterestRate() {
        return this.interestRate;
    }

    public int getPeriod() {
        return this.period;
    }

    public double RemainingCarLoan() {
        return (price - downPayment) + (price - downPayment)*(interestRate)/100*(period);
    }

    public double paymentAMonth() {
        return this.RemainingCarLoan()/(period*month);


    }
}
