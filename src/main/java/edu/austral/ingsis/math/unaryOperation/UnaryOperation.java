package edu.austral.ingsis.math.unaryOperation;

import edu.austral.ingsis.math.Function;
import java.util.List;
import java.util.Map;

public abstract class UnaryOperation implements Function {
  private final Function function;

  public UnaryOperation(Function function) {
    this.function = function;
  }

  public Function getFunction() {
    return this.function;
  }

  @Override
  public double evaluate(Map<String, Double> values) {
    return function.evaluate(values);
  }

  @Override
  public List<String> getVariables(List<String> variables) {
    return function.getVariables(variables);
  }

  @Override
  public String toString() {
    return "";
  }
}
