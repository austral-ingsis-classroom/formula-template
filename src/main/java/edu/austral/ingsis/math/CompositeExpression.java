package edu.austral.ingsis.math;

import java.util.ArrayList;
import java.util.List;

public class CompositeExpression implements Function {
  private List<Function> children;

  public CompositeExpression() {
    children = new ArrayList<>();
  }

  public void addChild(Function child) {
    children.add(child);
  }

  public void removeChild(Function child) {
    children.remove(child);
  }

  @Override
  public Double solve() {
    return null;
  }
}
