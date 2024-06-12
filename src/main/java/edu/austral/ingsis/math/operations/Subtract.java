package edu.austral.ingsis.math.operations;

import edu.austral.ingsis.math.Function;

public class Subtract implements Function {
  private final Function argument1;
  private final Function argument2;

  public Subtract(Function argument1, Function argument2) {
    this.argument1 = argument1;
    this.argument2 = argument2;
  }

  @Override
  public Double solve() {
    return argument1.solve() - argument2.solve();
  }
}
