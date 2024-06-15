package edu.austral.ingsis.math;

import java.util.ArrayList;
import java.util.List;

public class MathEngine {
  private final List<Function> functions = new ArrayList<>();

  private void save(Function function) {
    functions.add(function);
  }

  public Double solve(Function function) {
    return function.solve();
  }

  public Function formulate(Function function) {
    save(function);
    return function;
  }

  public List<Function> printFunctions() {
    return functions;
  }

  public List<String> getVariables(Function function) {
    return function.getVariables();
  }
}
