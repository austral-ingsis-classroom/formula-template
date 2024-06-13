package edu.austral.ingsis.math;

import edu.austral.ingsis.math.operations.*;
import edu.austral.ingsis.math.operations.Module;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ResolutionTest {

  /** Case 1 + 6 */
  @Test
  public void shouldResolveSimpleFunction1() {
    final Double result = 7d;
    final MathEngine engine = new MathEngine();
    Function f = engine.formulate(
        new CompositeExpression(new Sum(new Constant(1), new Constant(6))));
    Double res = f.solve();

    assertThat(res, equalTo(7d));
  }

  /** Case 12 / 2 */
  @Test
  public void shouldResolveSimpleFunction2() {
    final Double result = 6d;
    final MathEngine engine = new MathEngine();
    Function f = engine.formulate(
        new CompositeExpression(new Division(new Constant(12), new Constant(2))));
    Double res = f.solve();
    assertThat(res, equalTo(6d));
  }

  /** Case (9 / 2) * 3 */
  @Test
  public void shouldResolveSimpleFunction3() {
    final Double result = 13.5;
    final MathEngine engine = new MathEngine();
    Function f = engine.formulate(
        new CompositeExpression(
            new Multiplication(
                new CompositeExpression(
                    new Division(new Constant(9), new Constant(2))
                ),
                new Constant(3)
            )
        )
    );

    Double res = f.solve();
    assertThat(res, equalTo(13.5d));
  }

  /** Case (27 / 6) ^ 2 */
  @Test
  public void shouldResolveSimpleFunction4() {
    final Double result = 20.25;
    final MathEngine engine = new MathEngine();
    Function f = engine.formulate(
        new CompositeExpression(
            new Power(
                new CompositeExpression(
                    new Division(new Constant(27), new Constant(6))
                ),
                new Constant(2)
            )
        )
    );

    Double res = f.solve();
    assertThat(res, equalTo(20.25d));
  }

  /** Case 36 ^ (1/2) */
  @Test
  public void shouldResolveSimpleFunction5() {
    final Double result = 6d;
    final MathEngine engine = new MathEngine();
    Function f = engine.formulate(
        new CompositeExpression(
            new Power(
                new Constant(36),
                new CompositeExpression(
                    new Division(new Constant(1), new Constant(2))
                )
            )
        )
    );

    Double res = f.solve();
    assertThat(res, equalTo(result));
  }

  /** Case |136| */
  @Test
  public void shouldResolveSimpleFunction6() {
    final Double result = 136d;
    final MathEngine engine = new MathEngine();
    Function f = engine.formulate(
        new Module(new Constant(136)));

    Double res = f.solve();
    assertThat(res, equalTo(result));
  }

  /** Case |-136| */
  @Test
  public void shouldResolveSimpleFunction7() {
    final Double result = 136d;
    final MathEngine engine = new MathEngine();
    Function f = engine.formulate(
        new Module(new Constant(-136)));

    Double res = f.solve();

    assertThat(res, equalTo(136d));
  }

  /** Case (5 - 5) * 8 */
  @Test
  public void shouldResolveSimpleFunction8() {
    final Double result = 0d;
    final MathEngine engine = new MathEngine();
    Function f = engine.formulate(
        new CompositeExpression(
            new Multiplication(
                new CompositeExpression(
                    new Subtraction(
                        new Constant(5), new Constant(5)
                    )
                ),
                new Constant(8)
            )
        )
    );

    Double res = f.solve();
    assertThat(res, equalTo(0d));
  }
}
