package com.test;

import com.cabinvoice.cabInvoice;
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {

    @Test
    public void givenTwoIntegerWhenCalculateShouldReturnTotalFare(){
        cabInvoice cabinvoice=new cabInvoice();
        Double result=cabinvoice.calculateFare(10,5);
        Assert.assertEquals(60,result,0);

    }

}
