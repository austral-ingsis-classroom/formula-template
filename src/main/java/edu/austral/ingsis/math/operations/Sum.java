package edu.austral.ingsis.math.operations;

import edu.austral.ingsis.math.Function;
import edu.austral.ingsis.math.Variable;

import java.util.ArrayList;
import java.util.List;

public class Sum implements Function {
  private final Function argument1;
  private final Function argument2;

  public Sum(Function argument1, Function argument2) {
    this.argument1 = argument1;
    this.argument2 = argument2;
  }

  @Override
  public Double solve() {
    return argument1.solve() + argument2.solve();
  }

  @Override
  public List<String> getVariables() {
    List<String> variables = new ArrayList<>();
    if (argument1 instanceof Variable) {
      variables.add(argument1.toString());
    }
    if (argument2 instanceof Variable) {
      variables.add(argument2.toString());
    }
    return variables;
  }

  @Override
  public String toString() {
    return argument1.toString() + " + " + argument2.toString();
  }
}
