package edu.austral.ingsis.math;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;

import edu.austral.ingsis.math.operations.*;
import edu.austral.ingsis.math.operations.Module;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ListVariablesTest {

  /** Case 1 + 6 */
  @Test
  public void shouldListVariablesFunction1() {
    MathEngine engine = new MathEngine();
    Function f = engine.formulate(new Sum(new Constant("1"), new Constant("6")));

    List<String> result = engine.getVariables(f);
    assertThat(result, empty());
  }

  /** Case 12 / div */
  @Test
  public void shouldListVariablesFunction2() {
    MathEngine engine = new MathEngine();
    Function f = engine.formulate(new Division(new Constant("12"), new Variable("div")));

    List<String> result = engine.getVariables(f);
    assertThat(result, containsInAnyOrder("div"));
  }

  /** Case (9 / x) * y */
  @Test
  public void shouldListVariablesFunction3() {
    MathEngine engine = new MathEngine();
    Function f =
        engine.formulate(
            new Multiplication(
                new CompositeExpression(new Division(new Constant("9"), new Variable("x"))),
                new Variable("y")));

    List<String> result = engine.getVariables(f);
    assertThat(result, containsInAnyOrder("x", "y"));
  }

  /** Case (27 / a) ^ b */
  @Test
  public void shouldListVariablesFunction4() {
    MathEngine engine = new MathEngine();
    Function f =
        engine.formulate(
            new Power(
                new CompositeExpression(new Division(new Constant("27"), new Variable("a"))),
                new Variable("b")));

    List<String> result = engine.getVariables(f);
    assertThat(result, containsInAnyOrder("a", "b"));
  }

  /** Case z ^ (1/2) */
  @Test
  public void shouldListVariablesFunction5() {
    MathEngine engine = new MathEngine();
    Function f =
        engine.formulate(
            new Power(
                new Variable("z"),
                new CompositeExpression(new Division(new Constant("1"), new Constant("2")))));

    List<String> result = engine.getVariables(f);
    assertThat(result, containsInAnyOrder("z"));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldListVariablesFunction6() {
    MathEngine engine = new MathEngine();
    Function f =
        engine.formulate(new Subtraction(new Module(new Variable("value")), new Constant("8")));

    List<String> result = engine.getVariables(f);
    assertThat(result, containsInAnyOrder("value"));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldListVariablesFunction7() {
    MathEngine engine = new MathEngine();
    Function f =
        engine.formulate(new Subtraction(new Module(new Variable("value")), new Constant("8")));

    List<String> result = engine.getVariables(f);
    assertThat(result, containsInAnyOrder("value"));
  }

  /** Case (5 - i) * 8 */
  @Test
  public void shouldListVariablesFunction8() {
    MathEngine engine = new MathEngine();
    Function f =
        engine.formulate(
            new Multiplication(
                new CompositeExpression(new Subtraction(new Constant("5"), new Variable("i"))),
                new Constant("8")));

    List<String> result = engine.getVariables(f);
    assertThat(result, containsInAnyOrder("i"));
  }
}
