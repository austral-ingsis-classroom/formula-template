package edu.austral.ingsis.math;

import java.util.Map;

public class Module implements UnaryOperation {
    final private Symbol subSymbol;

    public Module(Symbol subSymbol) {
        this.subSymbol = subSymbol;
    }

    @Override
    public Symbol getSubSymbol() {
        return subSymbol;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Double computeWithValues(Map<String, Double> values) {
        return Math.abs(subSymbol.computeWithValues(values));
    }
}
