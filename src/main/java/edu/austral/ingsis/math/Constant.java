package edu.austral.ingsis.math;

import java.util.Map;

public class Constant implements Symbol {
    private final double value;

    public Constant(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Double computeWithValues(Map<String, Double> values) {
        return value;
    }
}
