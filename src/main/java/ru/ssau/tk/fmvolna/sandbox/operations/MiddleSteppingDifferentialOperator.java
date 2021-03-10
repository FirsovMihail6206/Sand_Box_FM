package ru.ssau.tk.fmvolna.sandbox.operations;

import ru.ssau.tk.fmvolna.sandbox.functions.MathFunction;

public class MiddleSteppingDifferentialOperator extends SteppingDifferentialOperator {

    public MiddleSteppingDifferentialOperator(double step) {
        super(step);
    }

    @Override
    public MathFunction derive(MathFunction function) {
        return x -> (function.apply(x + step) - function.apply(x - step)) / (step * 2);
    }
}
