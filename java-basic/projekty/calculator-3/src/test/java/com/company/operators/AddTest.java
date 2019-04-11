package com.company.operators;

import com.company.Num;
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

public class AddTest {
    @Test
    public void evaluateAdd(){
        Add a = new Add(new Num(2), new Num(3));

        Assert.assertEquals((int)a.evaluate(), 5);

    }

}