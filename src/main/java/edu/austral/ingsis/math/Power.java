package edu.austral.ingsis.math;

import java.util.Map;

//TODO: could make it receive any power
public class Power implements UnaryOperation {
    final private Symbol subSymbol;

    public Power(Symbol subSymbol) {
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
        return Math.pow(subSymbol.computeWithValues(values), 2);
    }
}
