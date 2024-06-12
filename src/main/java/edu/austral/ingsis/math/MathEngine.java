package edu.austral.ingsis.math;

import java.util.ArrayList;
import java.util.List;

public class MathEngine {
  private final List<Function> functions = new ArrayList<>();

  public void save(Function function) {
    functions.add(function);
  }

  public Function solve(Function function) {
    return function.solve();
  }

  public List<Function> getFunctions() {
    return functions;
  }

}
