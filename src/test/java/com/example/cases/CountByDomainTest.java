package com.example.cases;

import com.example.email.cases.CountByDomain;
import org.junit.Assert;
import org.junit.Test;

public class CountByDomainTest {

    @Test
    public void testExecute(){

        String message = "Number of Hotmail is: 7"
                        + "\nNumber of Gmail is: 18"
                        + "\nNumber of Outlook is: 7";

        Assert.assertEquals(CountByDomain.countByDomain(), message);
    }

}