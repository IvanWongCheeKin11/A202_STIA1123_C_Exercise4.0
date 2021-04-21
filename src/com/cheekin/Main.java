package com.cheekin;

public class Main {

    public static void main(String[] args) {
        Car objCar = new Car (21000, 7);
        System.out.println("Price, DownPayment, InterestRate, Period: " +"RM"+ objCar.getPrice() + ", RM" + objCar.getDownPayment() +", "+ objCar.getInterestRate() + "%, " + objCar.getPeriod() + "Years");
        System.out.println("Remaining Car Loan:  " + objCar.RemainingCarLoan());
        System.out.println("Payment A Month: " + objCar.paymentAMonth());

        for (int i = 0; i < 70; i++) {
            System.out.print("-");
        }

        Toyota objToyota = new Toyota(18000, 12, 4);
        System.out.println("\n <---Toyota--->");
        System.out.println("Price, DownPayment, InterestRate, Period: " +"RM"+ objToyota.getPrice() + ", RM" + objToyota.getDownPayment() +", "+ objToyota.getInterestRate() + "%, " + objToyota.getPeriod() + "Years");
        System.out.println("Remaining Car Loan:  " + objToyota.RemainingCarLoan());
        System.out.println("Payment A Month: " + objToyota.paymentAMonth());

        for (int j = 0; j < 70; j++) {
            System.out.print("-");
        }

        Honda objHonda = new Honda(20000, 12, 5);
        System.out.println("\n <---Honda--->");
        System.out.println("Price, DownPayment, InterestRate, Period: " +"RM"+ objHonda.getPrice() + ", RM" + objHonda.getDownPayment() +", "+ objHonda.getInterestRate() + "%, " + objHonda.getPeriod() + "Years");
        System.out.println("Remaining Car Loan:  " + objHonda.RemainingCarLoan());
        System.out.println("Payment A Month: " + objHonda.paymentAMonth());
    }
}