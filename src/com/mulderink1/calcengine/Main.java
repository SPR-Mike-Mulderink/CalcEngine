package com.mulderink1.calcengine;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0, 17.0, 's');
        equations[3] = create(11.0, 3.0, 'm');

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.printf("Result = %s \n", equation.result);

        }
    }

    public static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;

        return equation;
    }
}
