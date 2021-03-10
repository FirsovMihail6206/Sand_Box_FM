package ru.ssau.tk.fmvolna.sandbox.functions.factory;

import ru.ssau.tk.fmvolna.sandbox.functions.ArrayTabulatedFunction;
import ru.ssau.tk.fmvolna.sandbox.functions.TabulatedFunction;

public class ArrayTabulatedFunctionFactory  implements TabulatedFunctionFactory {

    public TabulatedFunction create(double[] xValues, double[] yValues) {
        return new ArrayTabulatedFunction(xValues, yValues);
    }
}
