package edu.austral.ingsis.math;

public class CompositeExpression implements Function {
  private final Function argument;

  public CompositeExpression(Function argument) {
    this.argument = argument;
  }

  @Override
  public Double solve() {
    return argument.solve();
  }

  @Override
  public String toString() {
    return "(" + argument.toString() + ")";
  }
}
