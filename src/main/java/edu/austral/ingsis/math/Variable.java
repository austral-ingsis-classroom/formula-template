package edu.austral.ingsis.math;

import java.util.List;
import java.util.Map;

public class Variable implements Function {
  private final String name;

  public Variable(String name) {
    this.name = name;
  }

  @Override
  public double evaluate(Map<String, Double> values) {
    return values.get(name);
  }

  @Override
  public List<String> getVariables(List<String> variables) {
    variables.add(name);
    return variables;
  }

  @Override
  public String toString() {
    return name;
  }
}
