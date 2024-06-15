package edu.austral.ingsis.math.operations;

import edu.austral.ingsis.math.Constant;
import edu.austral.ingsis.math.Function;
import java.util.ArrayList;
import java.util.List;

public class SquareRoot implements Function {
  private final Function argument;
  private final Function power;

  public SquareRoot(Function argument) {
    this.argument = argument;
    this.power = new Power(argument, new Constant("0.5"));
  }

  @Override
  public Double solve() {
    return power.solve();
  }

  @Override
  public List<String> getVariables() {
    return new ArrayList<>(argument.getVariables());
  }
}
