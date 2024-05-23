package edu.austral.ingsis.math;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class FunctionImpl implements Function {
    private Symbol root;

    public FunctionImpl(Symbol root) {
        this.root = root;
    }

    @Override
    public List<String> getAllVariables() {
        return List.of();
    }

    @Override
    public Double compute() {
        return computeWithValues(Collections.emptyMap());
    }

    @Override
    public Double computeWithValues(Map<String, Double> values) {
        return root.computeWithValues(values);
    }

    @Override
    public void accept(Visitor visitor) {

    }
}
