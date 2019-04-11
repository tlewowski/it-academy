package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {
    @Test
    public void evaluateParser() throws InstantiationException, IllegalAccessException {
        Node a = getNodeFixture();
        Assert.assertEquals(a.evaluate(),5,6);


    }
    @Test
    public  void evaluateParser2() throws InstantiationException, IllegalAccessException {
        Node q = getNodeFixture();
        Assert.assertEquals("(5.0-3.0)" , q.serialize());
    }

    private Node getNodeFixture() throws IllegalAccessException, InstantiationException {
        Parser a = new Parser();
        String [] s={"-", "5", "3"};
        return a.makeTree(s);
    }
    @Test
    public void NodeWholeLine() throws IllegalAccessException, InstantiationException {
        Parser a = new Parser();
        String [] s={"-", "5", "3", "p"};
        try {
            a.makeTree(s);
            fail("Ta linia nie jest poprawnym wyrazeniem!");
        }
        catch (IllegalArgumentException e){

        }
    }
}