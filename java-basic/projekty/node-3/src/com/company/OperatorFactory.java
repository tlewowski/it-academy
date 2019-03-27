package com.company;

import com.company.operators.Add;
import com.company.operators.Operator;

public class OperatorFactory {

    public static Operator createFromString(String s)
    {
        if(s.equals("+"))
        {
            return new Add();
        }
        else {
            throw new IllegalArgumentException();
        }
    }

}
