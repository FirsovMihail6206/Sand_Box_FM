package ru.ssau.tk.fmvolna.sandbox.operations;

import ru.ssau.tk.fmvolna.sandbox.functions.MathFunction;

public interface DifferentialOperator<T extends MathFunction> {
    T derive(T function);
}
