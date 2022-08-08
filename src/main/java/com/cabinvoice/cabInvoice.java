package com.cabinvoice;

public class cabInvoice {

    //Calculate fare and minimum fare
    public double calculateFare(double time,double distance){
        double cost=distance*10 + time*1;
        if((distance*10 + time) <5){
            return 5;
        }
        else return cost;
    }
    //Calculate the Total Fare for Multiple Rides
    public double calculateTotalFare(double[][] rideArray){
        double totalFare = 0;
        for(double[] ride : rideArray)
        {
            totalFare += calculateFare(ride[0],ride[1]);
        }
        return totalFare;
    }
}
