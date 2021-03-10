package ru.ssau.tk.fmvolna.sandbox.functions.factory;

import ru.ssau.tk.fmvolna.sandbox.functions.LinkedListTabulatedFunction;
import ru.ssau.tk.fmvolna.sandbox.functions.TabulatedFunction;


public class LinkedListTabulatedFunctionFactory  implements TabulatedFunctionFactory {

    public TabulatedFunction create(double[] xValues, double[] yValues) {
        return new LinkedListTabulatedFunction(xValues, yValues);
    }
}