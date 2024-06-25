package edu.austral.ingsis.math.unaryOperation;

import edu.austral.ingsis.math.Function;

public class Parenthesis extends UnaryOperation {
  public Parenthesis(Function function) {
    super(function);
  }

  @Override
  public String toString() {
    return "(" + getFunction().toString() + ")";
  }
}
