package edu.austral.ingsis.math.operations;

import edu.austral.ingsis.math.CompositeExpression;
import edu.austral.ingsis.math.Constant;
import edu.austral.ingsis.math.Function;

public class Module implements Function {
  private final Function argument;
  private final Function power;

  public Module(Function argument) {
    this.argument = argument;
    this.power = new Power(argument, new Constant("2"));
  }

  @Override
  public Double solve() {
    return new SquareRoot(new CompositeExpression(power)).solve();
  }

  @Override
  public String toString() {
    return "|" + argument.toString() + "|";
  }
}
