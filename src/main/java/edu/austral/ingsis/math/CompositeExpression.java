package edu.austral.ingsis.math;

import java.util.List;

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
  public List<String> getVariables() {
    List<String> variables = argument.getVariables();
    variables.addAll(argument.getVariables());
    return variables;
  }

  @Override
  public String toString() {
    return "(" + argument.toString() + ")";
  }
}
