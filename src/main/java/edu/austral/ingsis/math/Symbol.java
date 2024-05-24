package edu.austral.ingsis.math;

import java.util.Map;

public interface Symbol extends Visitable {
  Double computeWithValues(Map<String, Double> values);
}
