package edu.austral.ingsis.math.binaryOperation;

import edu.austral.ingsis.math.Function;
import java.util.List;
import java.util.Map;

public abstract class BinaryOperation implements Function {
  private final Function left;
  private final Function right;

  public BinaryOperation(Function left, Function right) {
    this.left = left;
    this.right = right;
  }

  public Function getLeft() {
    return left;
  }

  public Function getRight() {
    return right;
  }

  @Override
  public double evaluate(Map<String, Double> values) {
    return 0;
  }

  @Override
  public List<String> getVariables(List<String> variables) {
    left.getVariables(variables);
    return right.getVariables(variables);
  }

  @Override
  public String toString() {
    return "";
  }
}
