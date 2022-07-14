package com.example.cases;

import com.example.email.cases.EmailRepeat;
import org.junit.Assert;
import org.junit.Test;

public class EmailRepeatTest {

    @Test
    public void testExecute(){
        Assert.assertEquals(EmailRepeat.getNoRepeatEmail().size(), 34);
    }

}