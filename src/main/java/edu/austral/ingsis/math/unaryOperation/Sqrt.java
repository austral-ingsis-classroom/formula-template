package edu.austral.ingsis.math.unaryOperation;

import edu.austral.ingsis.math.Function;

import java.util.Map;

public class Sqrt extends UnaryOperation {
  public Sqrt(Function function) {
    super(function);
  }

  @Override public double evaluate(Map<String, Double> values) {
    return Math.sqrt(getFunction().evaluate(values));
  }

  @Override public String toString() {
    return "sqrt(" + getFunction().toString() + ")";
  }
}
