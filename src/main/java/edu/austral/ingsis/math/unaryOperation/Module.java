package edu.austral.ingsis.math.unaryOperation;

import edu.austral.ingsis.math.Function;

import java.util.Map;

public class Module extends UnaryOperation {
  public Module(Function function) {
    super(function);
  }

    @Override public double evaluate(Map<String, Double> values) {
        return Math.abs(getFunction().evaluate(values));
    }

    @Override public String toString() {
    return "|" + getFunction().toString() + "|";
    }
}
