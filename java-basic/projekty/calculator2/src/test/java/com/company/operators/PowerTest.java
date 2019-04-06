package com.company.operators;

import com.company.Node;
import com.company.Num;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {
    @Test
    public void evaluatePower(){
        Power s = new Power (new Num(4),new Num(3));
        Assert.assertNotNull(s.evaluate());
    }

}