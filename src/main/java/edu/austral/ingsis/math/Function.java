package edu.austral.ingsis.math;

import java.util.List;
import java.util.Map;

public interface Function extends Visitable {
    List<String> getAllVariables();
    Double compute();
    Double computeWithValues(Map<String, Double> values);
}
