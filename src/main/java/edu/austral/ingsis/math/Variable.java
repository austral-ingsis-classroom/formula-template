package edu.austral.ingsis.math;

import java.util.List;

public class Variable implements Function {
  private final String name;
  private final double value;

  public Variable(String name) {
    this(name, 0);
  }

  public Variable(String name, double value) {
    this.name = name;
    this.value = value;
  }

  @Override
  public String toString() {
    return name;
  }

  @Override
  public Double solve() {
    return value;
  }

  @Override
  public List<String> getVariables() {
    return List.of(this.name);
  }
}
