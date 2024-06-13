package edu.austral.ingsis.math.operations;

import edu.austral.ingsis.math.Function;

public class Division implements Function {
  private final Function argument1;
  private final Function argument2;

  public Division(Function argument1, Function argument2) {
    this.argument1 = argument1;
    this.argument2 = argument2;
  }

  @Override
  public Double solve() {
    return argument1.solve() / argument2.solve();
  }
}
