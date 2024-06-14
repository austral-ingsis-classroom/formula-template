package edu.austral.ingsis.math;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;

import edu.austral.ingsis.math.binaryOperation.*;
import edu.austral.ingsis.math.unaryOperation.Module;
import edu.austral.ingsis.math.unaryOperation.Parenthesis;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ListVariablesTest {

  /** Case 1 + 6 */
  @Test
  public void shouldListVariablesFunction1() {
    final List<String> result =
        new Addition(new Constant(1), new Constant(6)).getVariables(new ArrayList<>());

    assertThat(result, empty());
  }

  /** Case 12 / div */
  @Test
  public void shouldListVariablesFunction2() {
    final List<String> result =
        new Division(new Constant(12), new Variable("div")).getVariables(new ArrayList<>());

    assertThat(result, containsInAnyOrder("div"));
  }

  /** Case (9 / x) * y */
  @Test
  public void shouldListVariablesFunction3() {
    final List<String> result =
        new Multiplication(
                new Parenthesis(new Division(new Constant(9), new Variable("x"))),
                new Variable("y"))
            .getVariables(new ArrayList<>());

    assertThat(result, containsInAnyOrder("x", "y"));
  }

  /** Case (27 / a) ^ b */
  @Test
  public void shouldListVariablesFunction4() {
    final List<String> result =
        new Elevate(
                new Parenthesis(new Division(new Constant(27), new Variable("a"))),
                new Variable("b"))
            .getVariables(new ArrayList<>());

    assertThat(result, containsInAnyOrder("a", "b"));
  }

  /** Case z ^ (1/2) */
  @Test
  public void shouldListVariablesFunction5() {
    final List<String> result =
        new Elevate(
                new Variable("z"), new Parenthesis(new Division(new Constant(1), new Constant(2))))
            .getVariables(new ArrayList<>());

    assertThat(result, containsInAnyOrder("z"));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldListVariablesFunction6() {
    final List<String> result =
        new Subtraction(new Module(new Variable("value")), new Constant(8))
            .getVariables(new ArrayList<>());

    assertThat(result, containsInAnyOrder("value"));
  }

  /** Case (5 - i) * 8 */
  @Test
  public void shouldListVariablesFunction8() {
    final List<String> result =
        new Multiplication(
                new Parenthesis(new Subtraction(new Constant(5), new Variable("i"))),
                new Constant(8))
            .getVariables(new ArrayList<>());

    assertThat(result, containsInAnyOrder("i"));
  }
}
