package com.example.calculator;

import com.example.calculator.model.Function;
import com.example.email.cases.CountEmail;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testExecute() {

        Assert.assertEquals(Calculator.derivar(
                        new Function(2, "x", 2)).toString(),
                (new Function(4, "x", 1)).toString()
        );

        Assert.assertEquals(Calculator.integrar(
                        new Function(2,"x",2)).toString(),
                (new Function(1,"x",3)).toString()
        );

    }

}