package com.example.cases;

import com.example.email.cases.EmailByDomain;
import org.junit.Assert;
import org.junit.Test;

public class EmailByDomainTest {

    @Test
    public void testExecute(){
        Assert.assertEquals(EmailByDomain.getEmailHotmail().size(), 7);
        Assert.assertEquals(EmailByDomain.getEmailOutlook().size(), 7);
        Assert.assertEquals(EmailByDomain.getEmailGmail().size(), 18);
    }
}