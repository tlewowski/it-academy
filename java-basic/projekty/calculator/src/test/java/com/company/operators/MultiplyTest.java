package com.company.operators;

import com.company.Num;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyTest {
    @Test
    public void evaluateMultiply(){
        Multiply a = new Multiply(new Num(2), new Num(3));

        Assert.assertEquals((int)a.evaluate(), 6);

}}