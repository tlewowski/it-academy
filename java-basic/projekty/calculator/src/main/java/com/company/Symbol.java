package com.company;

import com.company.operators.*;

public enum Symbol {
    PLUS(new Add()), MINUS(new Subtract()),
    TIMES(new Multiply()), DIVIDE(new Divide()),
    POWER(new Power());
    Symbol(Operator operator){
        op = operator;
    }
    Operator op;
    Operator getOperator() throws InstantiationException, IllegalAccessException {
    return op.makeNew();
    }
}
