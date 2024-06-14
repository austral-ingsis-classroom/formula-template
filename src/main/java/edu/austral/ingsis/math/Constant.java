package edu.austral.ingsis.math;

import java.util.List;
import java.util.Map;

public class Constant implements Function {
    private final double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public double evaluate(Map<String, Double> values) {
        return value;
    }

    @Override
    public List<String> getVariables(List<String> variables) {
        return variables;
    }

    @Override
    public String toString() {
        if (value == (int) value) {
            return String.valueOf((int) value);
        } else {
            return String.valueOf(value);
        }
    }
}
