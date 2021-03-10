package ru.ssau.tk.fmvolna.sandbox.functions.factory;
import ru.ssau.tk.fmvolna.sandbox.functions.TabulatedFunction;

public interface TabulatedFunctionFactory  {

    TabulatedFunction create(double[] xValues, double[] yValues);
}
