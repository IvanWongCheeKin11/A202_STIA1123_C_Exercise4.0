package com.cheekin;

public class Toyota extends Car {

    private int month;





    public Toyota(double RCL, int M, int P) {
        super(RCL,M);
        month = P;

    }

    public void CarKey() {
        System.out.println("Get Car Key.");
    }


    //getter

    public double getMonth() {
        return this.month;
    }

    public double getPaymentAMonth() {
        return this.paymentAMonth();
    }

}