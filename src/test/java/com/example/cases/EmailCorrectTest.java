package com.example.cases;

import com.example.email.cases.EmailCorrect;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.stream.Collectors;

public class EmailCorrectTest {

    @Test
    public void testExecute(){
        Map<String, Boolean> emailsVerify = EmailCorrect.verifyEmail();

        long isTrue = emailsVerify.values()
                .stream()
                .filter(item -> item.equals(true))
                .collect(Collectors.toList())
                .size();

        Assert.assertEquals(isTrue, 13l);
    }

}