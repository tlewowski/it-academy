package com.company;

import com.company.operators.Add;
import com.company.operators.Operator;

public class OperatorFactory {

    public static Operator createFromString(String s) throws IllegalAccessException, InstantiationException {

        for(Symbol op: Symbol.values()){
            if (s.equals(op.getOperator().getSymbol())) {
                return op.getOperator();
            }
        } throw new IllegalArgumentException();

    //return Symbol.valueOf(s).getOperator();
    }

}
