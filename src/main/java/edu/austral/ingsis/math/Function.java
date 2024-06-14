package edu.austral.ingsis.math;

import java.util.List;
import java.util.Map;

public interface Function {
    double evaluate(Map<String, Double> values);
    List<String> getVariables(List<String> variables);
    String toString();
}
