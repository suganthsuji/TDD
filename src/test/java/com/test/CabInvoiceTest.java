package com.test;

import com.cabinvoice.cabInvoice;
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {

    //testing fare for single Cab Rides
    @Test
    public void givenTwoIntegerWhenCalculateShouldReturnTotalFare(){
        cabInvoice cabinvoice=new cabInvoice();
        Double result=cabinvoice.calculateFare(10,5);
        Assert.assertEquals(60,result,0);

    }
    //testing Multiple Rides
    @Test
    public void givenMultipleRidesWhenCalculateShouldReturnTotalFare(){
        cabInvoice cabinvoice=new cabInvoice();
        double [][] rideArray = {
                {5,20},
                {2,0.5},
                {1.5,2}
        };
        Double result=cabinvoice.calculateTotalFare(rideArray);
        Assert.assertEquals(233.5,result,0);

    }

}
