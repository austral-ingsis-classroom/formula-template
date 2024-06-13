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
    functions.add(function);
    return function;
  }

  public void printFunctions() {
    for (Function function : functions) {
      System.out.println(function);
    }
  }

}
