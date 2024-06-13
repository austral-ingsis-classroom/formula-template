package edu.austral.ingsis.math;

import java.util.Collections;
import java.util.List;

public class Constant implements Function {
  private final String value;
  private final double parsedValue;

  public Constant(String value) {
    this.value = value;
    this.parsedValue = Double.parseDouble(value);
  }

  @Override
  public Double solve() {
    return parsedValue;
  }

  @Override
  public List<String> getVariables() {
    return Collections.emptyList();
  }

  @Override
  public String toString() {
    return value;
  }
}
