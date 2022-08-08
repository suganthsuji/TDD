package com.cabinvoice;

public class InvoiceGenerator {
    //Return Total RIde
    public int getTotalRides(double[][] rideArray)
    {
        int count = 0;
        for(double[] a : rideArray)
        {
            count++;
        }
        return count;
    }

   //Return Total Fare
    public double calculateTotalFare(double[][] rideArray) {
        cabInvoice cabInvoice = new cabInvoice();
        return cabInvoice.calculateTotalFare(rideArray);
    }

   //Return Average Fare
    public double calculateAverageFare(double[][] rideArray) {
        double totalFare = calculateTotalFare(rideArray);
        int noOfRides = getTotalRides(rideArray);
        double averageFare = totalFare / noOfRides;
        return averageFare;
    }
}
