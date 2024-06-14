package edu.austral.ingsis.math.unaryOperation;

import edu.austral.ingsis.math.Function;
import java.util.List;
import java.util.Map;

public abstract class UnaryOperation implements Function {
    private final Function function;

    public UnaryOperation(Function function) {
        this.function = function;
    }

    @Override
    public double evaluate(Map<String, Double> values) {
        if (this instanceof Sqrt) {
            return Math.sqrt(function.evaluate(values));
        } else if (this instanceof Module) {
            return Math.abs(function.evaluate(values));
        } else { // if (this instanceof Parenthesis)
            return function.evaluate(values);
        }
    }

    @Override
    public List<String> getVariables(List<String> variables) {
        return function.getVariables(variables);
    }

    @Override
    public String toString() {
        if (this instanceof Sqrt) {
            return "sqrt(" + function.toString() + ")";
        } else if (this instanceof Module) {
            return "|" + function.toString() + "|";
        } else { // if (this instanceof Parenthesis)
            return "(" + function.toString() + ")";
        }
    }
}
