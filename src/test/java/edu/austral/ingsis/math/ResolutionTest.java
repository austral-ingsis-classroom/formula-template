package edu.austral.ingsis.math;

import edu.austral.ingsis.math.binaryOperation.*;
import edu.austral.ingsis.math.unaryOperation.Module;
import edu.austral.ingsis.math.unaryOperation.Parenthesis;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ResolutionTest {

  /** Case 1 + 6 */
  @Test
  public void shouldResolveSimpleFunction1() {
    final Double result = new Addition(
            new Constant(1),
            new Constant(6)).evaluate(Collections.emptyMap());

    assertThat(result, equalTo(7d));
  }

  /** Case 12 / 2 */
  @Test
  public void shouldResolveSimpleFunction2() {
    final Double result = new Division(
            new Constant(12),
            new Constant(2)).evaluate(Collections.emptyMap());

    assertThat(result, equalTo(6d));
  }

  /** Case (9 / 2) * 3 */
  @Test
  public void shouldResolveSimpleFunction3() {
    final Double result = new Multiplication(
            new Parenthesis(new Division(new Constant(9), new Constant(2))),
            new Constant(3)).evaluate(Collections.emptyMap());

    assertThat(result, equalTo(13.5d));
  }

  /** Case (27 / 6) ^ 2 */
  @Test
  public void shouldResolveSimpleFunction4() {
    final Double result = new Elevate(
            new Parenthesis(new Division(new Constant(27), new Constant(6))),
            new Constant(2)).evaluate(Collections.emptyMap());

    assertThat(result, equalTo(20.25d));
  }

  /** Case 36 ^ (1/2) */
  @Test
  public void shouldResolveSimpleFunction5() {
    final Double result = new Elevate(
            new Constant(36),
            new Parenthesis(new Division(new Constant(1), new Constant(2)))).evaluate(Collections.emptyMap());

    assertThat(result, equalTo(6d));
  }

  /** Case |136| */
  @Test
  public void shouldResolveSimpleFunction6() {
    final Double result = new Module(new Constant(136)).evaluate(Collections.emptyMap());

    assertThat(result, equalTo(136d));
  }

  /** Case |-136| */
  @Test
  public void shouldResolveSimpleFunction7() {
    final Double result = new Module(new Constant(-136)).evaluate(Collections.emptyMap());

    assertThat(result, equalTo(136d));
  }

  /** Case (5 - 5) * 8 */
  @Test
  public void shouldResolveSimpleFunction8() {
    final Double result = new Multiplication(
            new Parenthesis(new Subtraction(new Constant(5), new Constant(5))),
            new Constant(8)).evaluate(Collections.emptyMap());

    assertThat(result, equalTo(0d));
  }
}
