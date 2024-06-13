package edu.austral.ingsis.math;

public class Constant implements Function {
  private final double value;

  public Constant(double value) {
    this.value = value;
  }

  @Override
  public Double solve() {
    return value;
  }
}
