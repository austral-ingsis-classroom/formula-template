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

  @Override
  public double evaluate(Map<String, Double> values) {
    if (this instanceof Addition) {
      return left.evaluate(values) + right.evaluate(values);
    } else if (this instanceof Subtraction) {
      return left.evaluate(values) - right.evaluate(values);
    } else if (this instanceof Division) {
      return left.evaluate(values) / right.evaluate(values);
    } else if (this instanceof Multiplication) {
      return left.evaluate(values) * right.evaluate(values);
    } else { // if (this instanceof Elevate)
      return Math.pow(left.evaluate(values), right.evaluate(values));
    }
  }

  @Override
  public List<String> getVariables(List<String> variables) {
    left.getVariables(variables);
    return right.getVariables(variables);
  }

  @Override
  public String toString() {
    if (this instanceof Addition) {
      return left.toString() + " + " + right.toString();
    } else if (this instanceof Subtraction) {
      return left.toString() + " - " + right.toString();
    } else if (this instanceof Division) {
      return left.toString() + " / " + right.toString();
    } else if (this instanceof Multiplication) {
      return left.toString() + " * " + right.toString();
    } else { // if (this instanceof Elevate)
      return left.toString() + " ^ " + right.toString();
    }
  }
}
