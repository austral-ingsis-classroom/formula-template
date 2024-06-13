package edu.austral.ingsis.math;

import java.util.ArrayList;
import java.util.List;

public class CompositeExpression implements Function {
  private List<Function> children;
  private final Function argument;

  public CompositeExpression(Function argument) {
    children = new ArrayList<>();
    this.argument = argument;
    if (argument instanceof CompositeExpression) {
      addChild(argument);
    }
  }

  private void addChild(Function child) {
    children.add(child);
  }

  private void removeChild(Function child) {
    children.remove(child);
  }

  @Override
  public Double solve() {
    return argument.solve();
  }
}
