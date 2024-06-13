package edu.austral.ingsis.math;

import edu.austral.ingsis.math.operations.*;
import edu.austral.ingsis.math.operations.Module;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ResolutionWithVariablesTest {

  /** Case 1 + x where x = 3 */
  @Test
  public void shouldResolveFunction1() {
    final MathEngine engine = new MathEngine();
    final Function f = engine.formulate(
        new Sum(
            new Constant("1"),
            new Variable("x", 3)
        )
    );

    final Double result = f.solve();
    assertThat(result, equalTo(4d));
  }

  /** Case 12 / div where div = 4 */
  @Test
  public void shouldResolveFunction2() {
    final MathEngine engine = new MathEngine();
    final Function f = engine.formulate(
        new Division(
            new Constant("12"),
            new Variable("div", 4)
        )
    );

    final Double result = f.solve();

    assertThat(result, equalTo(3d));
  }

  /** Case (9 / x) * y where x = 3 and y = 4 */
  @Test
  public void shouldResolveFunction3() {
    final MathEngine engine = new MathEngine();
    final Function f = engine.formulate(
        new Multiplication(
            new CompositeExpression(
              new Division(
                  new Constant("9"),
                  new Variable("x", 3)
              )
            ),
            new Variable("y", 4)
        )
    );

    final Double result = f.solve();

    assertThat(result, equalTo(12d));
  }

  /** Case (27 / a) ^ b where a = 9 and b = 3 */
  @Test
  public void shouldResolveFunction4() {
    final MathEngine engine = new MathEngine();
    final Function f = engine.formulate(
        new Power(
            new CompositeExpression(
                new Division(
                    new Constant("27"),
                    new Variable("a", 9)
                )
            ),
            new Variable("b", 3)
        )
    );

    final Double result = f.solve();

    assertThat(result, equalTo(27d));
  }

  /** Case z ^ (1/2) where z = 36 */
  @Test
  public void shouldResolveFunction5() {
    final MathEngine engine = new MathEngine();
    final Function f = engine.formulate(
        new Power(
            new Variable("z", 36),
            new CompositeExpression(
                new Division(
                    new Constant("1"),
                    new Constant("2")
                )
            )
        )
    );

    final Double result = f.solve();

    assertThat(result, equalTo(6d));
  }

  /** Case |value| - 8 where value = 8 */
  @Test
  public void shouldResolveFunction6() {
    final MathEngine engine = new MathEngine();
    final Function f = engine.formulate(
      new Subtraction(
          new Module(
              new Variable("value", 8)
          ),
          new Constant("8")
      )
    );

    final Double result = f.solve();
    assertThat(result, equalTo(0d));
  }

  /** Case |value| - 8 where value = 8 */
  @Test
  public void shouldResolveFunction7() {
    final MathEngine engine = new MathEngine();
    final Function f = engine.formulate(
        new Subtraction(
            new Module(
                new Variable("value", 8)
            ),
            new Constant("8")
        )
    );

    final Double result = f.solve();

    assertThat(result, equalTo(0d));
  }

  /** Case (5 - i) * 8 where i = 2 */
  @Test
  public void shouldResolveFunction8() {
    final MathEngine engine = new MathEngine();
    final Function f = engine.formulate(
        new Multiplication(
            new CompositeExpression(
                new Subtraction(
                    new Constant("5"),
                    new Variable("i", 2)
                )
            ),
            new Constant("8")
        )
    );

    final Double result = f.solve();

    assertThat(result, equalTo(24d));
  }
}
