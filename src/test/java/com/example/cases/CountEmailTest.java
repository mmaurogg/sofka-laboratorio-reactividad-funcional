package com.example.cases;

import com.example.email.cases.CountEmail;
import org.junit.Assert;
import org.junit.Test;

public class CountEmailTest {

    @Test
    public void testExecute() {

        Assert.assertEquals(CountEmail.countEmail().longValue(), 32l);

    }

}