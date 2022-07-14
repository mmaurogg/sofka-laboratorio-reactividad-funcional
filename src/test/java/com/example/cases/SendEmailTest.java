package com.example.cases;

import com.example.email.cases.SendEmail;
import com.example.email.models.Email;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SendEmailTest {

    @Test
    public void testExecute(){
         List<Email> emailsVerify = SendEmail.emailsSends();

        long isTrue = emailsVerify.stream()
                .filter(item -> item.getSend().equals(true))
                .count();

        Assert.assertEquals(isTrue, 0l);
    }

}