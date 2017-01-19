package calculator;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CalculatorTest {
  @Test
  public void shouldBeAbleToAddTwoNumbers()  {
    int numberOne = 5;
    int numberTwo = 15;
    Calculator calculator = new Calculator();

    assertThat(calculator.add(numberOne, numberTwo), is(20));
  }

  @Test
  public void shouldSubtractTwoNumbers()  {
    int numberOne = 10;
    int numberTwo = 20;
    Calculator calculator = new Calculator();

    assertThat(calculator.subtract(numberOne, numberTwo), is(-10));

  }
}
