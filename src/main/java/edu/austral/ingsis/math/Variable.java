package edu.austral.ingsis.math;

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
}
