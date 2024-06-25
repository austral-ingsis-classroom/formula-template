package edu.austral.ingsis.math.binaryOperation;

import edu.austral.ingsis.math.Function;
import java.util.Map;

public class Division extends BinaryOperation {
  public Division(Function left, Function right) {
    super(left, right);
  }

  @Override
  public double evaluate(Map<String, Double> values) {
    return getLeft().evaluate(values) / getRight().evaluate(values);
  }

  @Override
  public String toString() {
    return getLeft().toString() + " / " + getRight().toString();
  }
}
