package com.company;

import com.company.operators.Add;
import com.company.operators.Operator;

public class Parser {
    int index=0;
    public Node operatorParser(String[] s) throws InstantiationException, IllegalAccessException {
        Operator op = OperatorFactory.createFromString(s[index]);
        System.out.println(op);
        index++;
        Node left=makeTree(s);
        Node right=makeTree(s);
        op.setLeft(left);
        op.setRigth(right);
        //return new Add(left,right);
        return op;
    }

    Node makeTree(String[] s) throws IllegalAccessException, InstantiationException {
        if (s.length <= index){
            throw new IllegalArgumentException();
        }

        try {
            double parseValue = Double.parseDouble(s[index]);
            index++;
            return new Num(parseValue);
        }
        catch(NumberFormatException e)
        {
            return operatorParser(s);
        }

    }

}
