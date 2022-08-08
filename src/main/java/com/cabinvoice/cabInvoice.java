package com.cabinvoice;

public class cabInvoice {

    //Calculate fare and minimum fare
    public double  calculateFare(double time,double distance){
        double cost=distance*10 + time*1;
        if((distance*10 + time) <5){
            return 5;
        }
        else return cost;
    }
}
