package com.mulderink1.calcengine;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0, 17.0);
        equations[3] = new MathEquation('m', 11.0, 3.0);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.printf("Main Result = %s \n", equation.getResult());
        }

        System.out.println("\nUsing Overloads\n");

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble, rightDouble);
        System.out.printf("Double Result = %s \n", equationOverload.getResult());

        equationOverload.execute(leftInt, rightInt);
        System.out.printf("Int Result = %s \n", equationOverload.getResult());

        equationOverload.execute((double)leftInt, rightInt);
        System.out.printf("Int and Casted Double Result = %s \n", equationOverload.getResult());
    }
}
