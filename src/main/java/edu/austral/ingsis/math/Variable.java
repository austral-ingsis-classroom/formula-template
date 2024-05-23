package edu.austral.ingsis.math;

import java.util.Map;

public class Variable implements Symbol {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Double computeWithValues(Map<String, Double> values) {
        return values.get(name);
    }
}
