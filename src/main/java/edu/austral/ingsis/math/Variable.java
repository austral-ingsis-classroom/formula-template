package edu.austral.ingsis.math;

public class Variable implements Function {
  private String name;

  @Override
  public String toString() {
    return name;
  }

  @Override
  public Double solve() {
    return 0.0;
  }
}
