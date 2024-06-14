package edu.austral.ingsis.math;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import edu.austral.ingsis.math.binaryOperation.*;
import edu.austral.ingsis.math.unaryOperation.Module;
import edu.austral.ingsis.math.unaryOperation.Parenthesis;
import org.junit.jupiter.api.Test;

public class PrintTest {

  /** Case 1 + 6 */
  @Test
  public void shouldPrintFunction1() {
    final String expected = "1 + 6";
    final String result = new Addition(new Constant(1), new Constant(6)).toString();

    assertThat(result, equalTo(expected));
  }

  /** Case 12 / 2 */
  @Test
  public void shouldPrintFunction2() {
    final String expected = "12 / 2";
    final String result = new Division(new Constant(12), new Constant(2)).toString();

    assertThat(result, equalTo(expected));
  }

  /** Case (9 / 2) * 3 */
  @Test
  public void shouldPrintFunction3() {
    final String expected = "(9 / 2) * 3";
    final String result =
        new Multiplication(
                new Parenthesis(new Division(new Constant(9), new Constant(2))), new Constant(3))
            .toString();

    assertThat(result, equalTo(expected));
  }

  /** Case (27 / 6) ^ 2 */
  @Test
  public void shouldPrintFunction4() {
    final String expected = "(27 / 6) ^ 2";
    final String result =
        new Elevate(
                new Parenthesis(new Division(new Constant(27), new Constant(6))), new Constant(2))
            .toString();

    assertThat(result, equalTo(expected));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldPrintFunction7() {
    final String expected = "|value| - 8";
    final String result =
        new Subtraction(new Module(new Variable("value")), new Constant(8)).toString();

    assertThat(result, equalTo(expected));
  }

  /** Case (5 - i) * 8 */
  @Test
  public void shouldPrintFunction8() {
    final String expected = "(5 - i) * 8";
    final String result =
        new Multiplication(
                new Parenthesis(new Subtraction(new Constant(5), new Variable("i"))),
                new Constant(8))
            .toString();

    assertThat(result, equalTo(expected));
  }
}
